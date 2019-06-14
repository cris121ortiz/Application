package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Thebeatles extends AppCompatActivity {

    private Button Regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thebeatles);

        Regresar = (Button) findViewById(R.id.Bregrsar);

        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thebeatles.this, SecondActivity.class);
                startActivity(intent);

            }
        });
    }



}
