package com.example.redes.microtareaspaul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.AsyncTask;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class grupo4_1 extends AppCompatActivity{

    Button btn;
    private ProgressBar progressBar;
    TextView txt;
    Integer counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo4_1);
        //Widget EditText donde se mostrara la fecha obtenida
        new SimpleDialog().show(getSupportFragmentManager(), "SimpleDialog");
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(10);
        btn = (Button) findViewById(R.id.btnProgress);
        btn.setText("Inicia!");
        txt = (TextView) findViewById(R.id.output);
        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view) {
                counter = 1;
                progressBar.setVisibility(View.VISIBLE);
                progressBar.setProgress(0);
                switch (view.getId()) {
                    case R.id.btnProgress:
                        new grupo4_1.MyAsyncTask().execute(10);
                        break;
                }
            }
        };
        btn.setOnClickListener(listener);
    }


    public class MyAsyncTask extends AsyncTask<Integer, Integer, String> {
        @Override
        protected String doInBackground(Integer... params) {
            for (; counter <= params[0]; counter++) {
                try {
                    Thread.sleep(1000);
                    publishProgress(counter);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "Tarea completa!. =)";
        }
        @Override
        protected void onPostExecute(String result) {
            progressBar.setVisibility(View.GONE);
            txt.setText(result);
            btn.setText("Reinicia");
        }
        @Override
        protected void onPreExecute() {
            txt.setText("Tarea ejecutandose...");
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
            txt.setText("Ejecutandose..." +  values[0]);
            progressBar.setProgress(values[0]);
        }
    }
    }


