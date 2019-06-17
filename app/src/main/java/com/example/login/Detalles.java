package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        TextView name = (TextView) findViewById(R.id.tv_name);
        TextView followers = (TextView) findViewById(R.id.Followera);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b!=null){
            name.setText(b.getString("Tit"));
            followers.setText(b.getString("Det"));
        }




    }
}
