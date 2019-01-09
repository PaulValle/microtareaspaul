package com.example.redes.microtareaspaul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

public class grupo2 extends AppCompatActivity {
    private Button btnMostrar;
    private TextView txtGato;
    private TextView txtHora;
    private Button btnHora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo2);

        //Pregunta 3
        Spinner spinner = findViewById(R.id.cmbSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.arrayColores2,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtGato = findViewById(R.id.txtGato);
                Spinner spin = findViewById(R.id.cmbSpinner);
                String seleccionado = spin.getSelectedItem().toString();

                txtGato.setText(seleccionado);

            }
        });

        //Pregunta 1
        TimePicker tp = (TimePicker) this.findViewById(R.id.timePicker);
        tp.setIs24HourView(true);

        txtHora=(TextView)findViewById(R.id.textViewHora);
        final TimePicker timePicker= (TimePicker)findViewById(R.id.timePicker);
        btnHora=(Button)findViewById(R.id.buttonActHora);
        btnHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hora= timePicker.getCurrentHour();
                int min=timePicker.getCurrentMinute();
                txtHora.setText(String.valueOf(hora)+": "+String.valueOf(min));

            }
        });
    }
    public void regresar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}