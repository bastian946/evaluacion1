package com.example.android1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Clientes;
import Objetos.Productos;

public class Jarrones_act extends AppCompatActivity {
    private Spinner spclientes, sptipo;
    private TextView adicional, total2;
    private RatingBar calificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarrones);

        spclientes=(Spinner) findViewById(R.id.sp2);
        sptipo=(Spinner) findViewById(R.id.sp3);
        adicional=(TextView) findViewById(R.id.tv4);
        calificacion=(RatingBar) findViewById(R.id.rb);
        total2=(TextView)findViewById(R.id.tv5);

        Productos productos=new Productos();
        Clientes clientes =new Clientes();

        ArrayAdapter productpsAdapt = new ArrayAdapter(this, android.R.layout.simple_list_item_1,productos.getMaterial());
        ArrayAdapter clientesAdapt =  new ArrayAdapter(this, android.R.layout.simple_list_item_1,productos.getMaterial());

        sptipo.setAdapter(productpsAdapt);
        spclientes.setAdapter(clientesAdapt);

        sptipo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (sptipo.getSelectedItem().toString().equals(productos.getMaterial()[0])) {
                    adicional.setText("El adicional agregado es: " + productos.getAdicional()[0]);
                } else if (sptipo.getSelectedItem().toString().equals(productos.getMaterial()[1])) {
                    adicional.setText("El adicional agregado es: " + productos.getAdicional()[1]);
                } else {
                    adicional.setText("El adicional agregadop es: " + productos.getAdicional()[2]);
                }

            }

        });

    }
    public void Calular3(View View) {
        Clientes clientes = new Clientes();
        Productos productos = new Productos();
        int total3;

        if (spclientes.getSelectedItem().toString().equals(clientes.getNombre()[0])) {
            if (sptipo.getSelectedItem().toString().equals(productos.getMaterial()[0])) {
                total3 = productos.resMaterial(clientes.getSalario()[0], 0);
                total2.setText("El costo final es" + total3);
                calificacion.setRating(productos.getValora()[0]);

        } else if (spclientes.getSelectedItem().toString().equals(clientes.getNombre()[1])) {
            total3 = productos.resMaterial(clientes.getSalario()[0], 1);
            total2.setText("El costo final es" + total3);
            calificacion.setRating(productos.getValora()[1]);
        } else {
            total3 = productos.resMaterial(clientes.getSalario()[0], 2);
            total2.setText("El costo final es" + total3);
            calificacion.setRating(productos.getValora()[2]);
        }
    }
         else{
            if (spclientes.getSelectedItem().toString().equals(clientes.getNombre()[0])) {
                if (sptipo.getSelectedItem().toString().equals(productos.getMaterial()[0])) {
                    total3 = productos.resMaterial(clientes.getSalario()[1], 0);
                    total2.setText("El costo final es" + total3);
                    calificacion.setRating(productos.getValora()[0]);
                }
            }
            else if (sptipo.getSelectedItem().toString().equals(productos.getMaterial()[1])) {
                total3 = productos.resMaterial(clientes.getSalario()[1], 1);
                total2.setText("El costo final es" + total3);
                calificacion.setRating(productos.getValora()[1]);
            }
            else{
                total3 = productos.resMaterial(clientes.getSalario()[2], 2);
                total2.setText("El costo final es" + total3);
                calificacion.setRating(productos.getValora()[2]);
            }

        }
    }
}





