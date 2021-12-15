package com.example.android1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usuario,contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=(EditText)findViewById(R.id.et1);
        contra=(EditText) findViewById(R.id.et2);

    }
    public void Iniciar (View View) {
        if ((usuario.getText().toString().trim().length() == 0) || (contra.getText().toString().trim().length()==0)){
            Toast.makeText(this,"debes ingresar los datos para inciar sesión",Toast.LENGTH_SHORT);
        }

        else if (usuario.getText().toString().trim().equals("bastian") && contra.getText().toString().trim().equals("123")){

            Intent i = new Intent(this, Jarrones_act.class);
            startActivity(i);

        }
        else {
            Toast.makeText(this, "datos incorrectos",Toast.LENGTH_SHORT).show();
        }

    }
    public void Calculosgene(View View){
        Intent i = new Intent(this,CalcularJarrones_act.class);
        startActivity(i);
    }


}



