package com.desarrolladorandroid.holamundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    boolean bandera = true;
    TextView texto;
    Button boton, boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById(R.id.textView1);
        texto.setText(getString(R.string.texto));
        boton = (Button) findViewById(R.id.button);
        boton.setText(getString(R.string.textoBoton));
        boton2 = (Button) findViewById(R.id.button2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Responsiva.class);
                startActivity(i);
            }
        });
        boton2.setOnClickListener(this);
        texto.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Intent i = new Intent(MainActivity.this, Constrain.class);
                startActivity(i);
                break;
        }
    }


}
