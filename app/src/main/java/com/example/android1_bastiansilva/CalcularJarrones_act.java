package com.example.android1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import Objetos.Productos;

public class CalcularJarrones_act extends AppCompatActivity {
    private CheckBox box12,box24;
    private Spinner material;
    private TextView total, totaljarr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_jarrones);
        box12 =(CheckBox)findViewById(R.id.ch1);
        box24= (CheckBox) findViewById(R.id.ch2);
        material=(Spinner) findViewById(R.id.sp1);
        total=(TextView) findViewById(R.id.tv2);
        totaljarr=(TextView)findViewById(R.id.tv6);

        Productos productos = new Productos();
        ArrayAdapter jarrAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,productos.getMaterial());
        material.setAdapter(jarrAdapter);

    }
    public  void  calcular2 (View View) {
        Productos productos = new Productos();
        int total2;

        if (box12.isChecked() && box24.isChecked()) {
            Toast.makeText(this, "Porfavor seleccione solo 1 opción", Toast.LENGTH_SHORT);
        } else if (!box12.isChecked() && !box24.isChecked()) {
            Toast.makeText(this, "tiene que seleccionar una 1 opción", Toast.LENGTH_SHORT);

        } else if (box12.isChecked()) {
            if (material.getSelectedItem().toString().equals(productos.getMaterial()[0])) {
                total2 = productos.precio12(0);
                totaljarr.setText("Compraste 12 jarrones de " + productos.getMaterial()[0].toLowerCase() + " y su costo es :" + productos.getAdicional()[0]);
                total.setText("El resultado es: " + total2);


            } else if (material.getSelectedItem().toString().equals(productos.getMaterial()[1])) {
                total2 = productos.precio12(1);
                totaljarr.setText("Compraste 12 jarrones de " + productos.getMaterial()[1].toLowerCase() + " y su costo es :" + productos.getAdicional()[1]);
                total.setText("El resultado es: " + total2);
            } else {
                total2 = productos.precio12(2);
                totaljarr.setText("Compraste 12 jarrones de " + productos.getMaterial()[2].toLowerCase() + " y su costo es :" + productos.getAdicional()[2]);
                total.setText("El resultado: " + total2);
            }

        } else {
            if (material.getSelectedItem().toString().equals(productos.getMaterial()[0])) {
                total2 = productos.precio24(0);
                totaljarr.setText("Compraste 24 jarrones de " +productos.getMaterial()[0].toLowerCase()+" y su costo es :" +productos.getAdicional()[0]);
                total.setText("El resultado es: " + total2);
            }

        else if (material.getSelectedItem().toString().equals(productos.getMaterial()[0])) {
                total2 = productos.precio24(0);
                totaljarr.setText("Compraste 24 jarrones de " +productos.getMaterial()[1].toLowerCase()+" y su costo es :" +productos.getAdicional()[1]);
                total.setText("El resultado es: " + total2);
            }

          else total2 = productos.precio24(2);
                totaljarr.setText("Compraste 24 jarrones de " +productos.getMaterial()[2].toLowerCase()+" y su costo es :" +productos.getAdicional()[2]);
                total.setText("El cresultado es: " + total2);
            }
        }
    }

