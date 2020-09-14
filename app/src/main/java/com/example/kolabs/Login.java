package com.example.kolabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_lyt);
        TextView registbut = (TextView) findViewById(R.id.registbtn);

        EditText username = (EditText) findViewById(R.id.tUsername_login);
        EditText password = (EditText) findViewById(R.id.tPassword_login);

        registbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoregist = new Intent(Login.this, Register.class);
                startActivity(gotoregist);
            }
        });
    }
}