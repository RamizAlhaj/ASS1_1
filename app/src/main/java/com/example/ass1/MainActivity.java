package com.example.ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private EditText EnterName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        EnterName = findViewById(R.id.EnterName);
    }

    public void btnSubmitOnClick(View view) {
        String name = EnterName.getText().toString();
        if (name.isEmpty()) {
            Toast.makeText(this, "please enter your name", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, LearnActivity.class);
            intent.putExtra(Constants.user_name, name.toString());
            // Launch the NextActivity
            startActivity(intent);
            finish();
        }
    }
}