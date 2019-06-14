package com.example.login;

import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText Usuario;
    private EditText Password;
    private Button Entrar;
    private Button Limpiar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario = (EditText)findViewById(R.id.Tusuario);
        Password = (EditText)findViewById(R.id.Tpassword);
        Entrar = (Button) findViewById(R.id.Bentrar);
        Limpiar = (Button) findViewById(R.id.Blimpiar);


        Entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validar(Usuario.getText().toString(), Password.getText().toString());
            }
        });


        Limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Password.setText("");
                Usuario.setText("");
            }
        });



    }


    private void validar (String TextUsuario, String TextPassword){

        if ((TextUsuario.equals("Cris")) && (TextPassword.equals("1234"))){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        }

        else{

            Toast.makeText(getApplicationContext(),"Datos Incorrectos!",Toast.LENGTH_SHORT).show();
        }


    }



}
