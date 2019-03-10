package com.edot.iotmonitor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLogin(View view) {
        EditText userName = findViewById(R.id.userID);
        EditText password = findViewById(R.id.password);
        if ("user".equals(userName.getText().toString()) &&
                "user".equals(password.getText().toString())) {
            startActivity(new Intent(this,DisplayActivity.class));
        }
        else if (userName.getText().toString().isEmpty() ||
                password.getText().toString().isEmpty()) {
            Toast.makeText(this,R.string.cantBeEmpty,Toast.LENGTH_SHORT)
                    .show();
        }
        else {
            password.setText("");
            Toast.makeText(this,R.string.inCorrectLoginCredentials,Toast.LENGTH_SHORT)
                    .show();
        }
    }
}
