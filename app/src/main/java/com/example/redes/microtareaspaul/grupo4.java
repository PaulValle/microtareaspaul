package com.example.redes.microtareaspaul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class grupo4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actividadGrupo1(View view) {
        Intent intent = new Intent(this, grupo4_1.class);
        startActivity(intent);
    }

}
