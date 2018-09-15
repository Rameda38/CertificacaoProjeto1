package br.com.apps.rameda.inciandocertificacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView tvprincipal=null;
       Button bttToast,bttRandon,bttCount;


       bttToast = (Button)findViewById(R.id.bttToast);
       bttCount = (Button)findViewById(R.id.bttCount);
       bttRandon = (Button)findViewById(R.id.bttRandon);
       tvprincipal = (TextView) findViewById(R.id.tvPrincipal);
       bttToast.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this,"Hello Toast" ,Toast.LENGTH_SHORT).show();
           }
       });
        final TextView finalTvprincipal=tvprincipal;
        bttCount.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               count = count+1;
               finalTvprincipal.setText(""+count);
           }
       });

        final TextView finalTvprincipal1=tvprincipal;
        bttRandon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = NumeroAleatorio.GerarNumeroAleatorio();
                finalTvprincipal1.setText(""+ numero);
            }
        });





    }
}
