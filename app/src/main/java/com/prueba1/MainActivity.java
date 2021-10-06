package com.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText c1;
    EditText contra;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1= (EditText) findViewById(R.id.usuario);
        contra= (EditText)  findViewById(R.id.contraseña);
        btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c1.getText().toString().equals("adm123")&&(contra.getText().toString().equals("adm123")))
                {
                    Intent I = new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(I);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"usuario o contraseña incorrecto",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}