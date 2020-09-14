package com.example.kolabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_lyt);
        RadioButton radmale = (RadioButton) findViewById(R.id.radioButtonmale);
        RadioButton radfemale = (RadioButton) findViewById(R.id.radioButtonfemale);
        TextView login = (TextView) findViewById(R.id.loginbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotologin = new Intent(Register.this, Login.class);
                startActivity(gotologin);
            }
        });


    }
}