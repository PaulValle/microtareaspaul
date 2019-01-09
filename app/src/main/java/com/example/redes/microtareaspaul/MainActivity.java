package com.example.redes.microtareaspaul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actividadGrupo1(View view) {
        Intent intent = new Intent(this, grupo1.class);
        startActivity(intent);
    }
    public void actividadGrupo2(View view) {
        Intent intent = new Intent(this, grupo2.class);
        startActivity(intent);
    }
    public void actividadGrupo3(View view) {
        Intent intent = new Intent(this, grupo3.class);
        startActivity(intent);
    }
    public void actividadGrupo4(View view) {
        Intent intent = new Intent(this, grupo4_1.class);
        startActivity(intent);
    }
    public void actividadGrupo5(View view) {
        Intent intent = new Intent(this, grupo5.class);
        startActivity(intent);
    }
    public void actividadGrupo5_1(View view) {
        Intent intent = new Intent(this, grupo5_1.class);
        startActivity(intent);
    }






}


