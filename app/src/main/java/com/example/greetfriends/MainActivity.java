package com.example.greetfriends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        return insets;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), MainActivity::onApplyWindowInsets);
    }

    public void CreateCard(View view) {
        EditText nameInput = findViewById(R.id.NameInput);
        String name = nameInput.getText().toString();

        Intent intent = new Intent(this, BirthdayGreetingActivity.class);
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name);
        startActivity(intent);
    }
}
