package com.example.redes.microtareaspaul;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class pspinner extends AppCompatActivity {
    Button button;
    TextView mytxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pspinner);
        Spinner spinner = findViewById(R.id.spin1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.arrayColores2,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        button = findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mytxt = findViewById(R.id.tv);
                Spinner spin = findViewById(R.id.spin1);
                String seleccionado = spin.getSelectedItem().toString();

                mytxt.setText(seleccionado);

            }
        });

    }
}