package com.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtt,txth,txtm;
    Integer TOTA,CONTADOR1,CONTADOR2;
    ImageButton btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtt= (TextView)findViewById(R.id.txttotal);
        txth= (TextView)findViewById(R.id.txthombre);
        txtm= (TextView)findViewById(R.id.txtmujer);
        btn1= (ImageButton) findViewById(R.id.imageButton3);
        Bundle B = getIntent().getExtras();
        TOTA = B.getInt("TOTAL");
        CONTADOR1 = B.getInt("CONTADORH");
        CONTADOR2 = B.getInt("CONTADORM");

        txtt.setText(""+TOTA);
        txth.setText(""+CONTADOR1);
        txtm.setText(""+CONTADOR2 );

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(I);
            }
        });
    }
}