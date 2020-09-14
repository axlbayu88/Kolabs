package com.example.kolabs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainAct extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonlogin = (Button) findViewById(R.id.loginbtn);
        Button buttonregist = (Button) findViewById(R.id.registbtn);

                buttonlogin.setOnClickListener(new View.OnClickListener (){
            public void onClick (View v){
                Intent gotoLogin = new Intent(MainAct.this,Login.class);
                startActivity(gotoLogin);
            }
        });

        buttonregist.setOnClickListener(new View.OnClickListener (){
            public void onClick (View v){
                Intent gotoregist = new Intent(MainAct.this,Register.class);
                startActivity(gotoregist);
            }
        });
    }
}
