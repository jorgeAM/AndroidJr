package com.example.sev.newbie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        texto = (TextView) findViewById(R.id.texto2);

        //llamamos al intent mandado
        Intent intent = getIntent();
        String cadena = intent.getStringExtra("saludo");
        texto.setText(cadena);
    }
}
