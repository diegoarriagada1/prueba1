package com.prueba1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView txt1,txt2;
    Spinner sp1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt1= (TextView) findViewById(R.id.txtnombre);
        txt2= (TextView) findViewById(R.id.txtedad);
        sp1= (Spinner) findViewById(R.id.spinner);
        btn = (Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar();


            }
        });
    }
    private void mostrar(){
        new AlertDialog.Builder(this)
                .setTitle("Atencion")
                .setMessage("¿Esta seguro de COntinuar ?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Integer h =0,m=0;
                        Integer Total = h+m;
                        String genero = sp1.getSelectedItem().toString();
                        if (genero.equals("HOMBRE"))
                        {
                            h++;
                        }
                        if (genero.equals("MUJER"))
                        {
                            m++;
                        }
                        Intent I = new Intent(getApplicationContext(),MainActivity2.class);

                        I.putExtra("TOTAL",Total);
                        I.putExtra("CONTADORH",h);
                        I.putExtra("CONTADORM",m);

                        startActivity(I);
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent I = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(I);
                    }
                })
                .show();
    }
}