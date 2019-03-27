package br.com.etecia.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button btnJogar;
    private TextView txtResultado;
    private Button btnLipar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnJogar = findViewById(R.id.btnJogar);
        txtResultado = findViewById(R.id.txtResultado);
        btnLipar = findViewById(R.id.btnLimpar);

  btnJogar.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Random random = new Random();
       int resultado =   random.nextInt(10);
          txtResultado.setText("O resultado é: "+ resultado);
      }

  });
 btnLipar.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         txtResultado.setText(" ");
     }
 });



    }
}
