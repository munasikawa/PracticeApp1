package com.pensievedesigns.practiceapp1;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logInClicked(View view) {

        EditText usernameEditTxt = findViewById(R.id.usernameEditTxt);

        EditText passwordEditTxt = findViewById(R.id.passwordEditTxt);
        passwordEditTxt.setTransformationMethod(new PasswordTransformationMethod());

        Log.i("Username", usernameEditTxt.getText().toString());
        Log.i("Password", passwordEditTxt.getText().toString());

        Toast.makeText(MainActivity.this, "Username is " + usernameEditTxt.getText().toString() + ", " + " Password is " + passwordEditTxt.getText().toString(),
                Toast.LENGTH_LONG).show();


    }
}
