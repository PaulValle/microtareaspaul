package com.example.redes.microtareaspaul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class grupo5_1 extends AppCompatActivity {
    private LinearLayout layoutCambiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo5_1);
    }
    public void cambiarOrientacion(View view){
        layoutCambiar = (LinearLayout) findViewById(R.id.layoutCambiar);
        if(layoutCambiar.getOrientation()==LinearLayout.VERTICAL){
            layoutCambiar.setOrientation(LinearLayout.HORIZONTAL);
        }else{
            layoutCambiar.setOrientation(LinearLayout.VERTICAL);
        }
    }
}
