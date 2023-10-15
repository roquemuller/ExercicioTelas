package br.com.cd6.exerciciotela;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class Tela3 extends ExemploCicloVida {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Você está na Tela 3");

        //Referencia o botão navegar do main.xml
        Button btnTela2 = (Button) findViewById(R.id.btnNavegar);

        //Seta o título do botão navegar
        btnTela2.setText("Voltar --> Tela 2");

        //Seta o evento do click do botão navegar
        btnTela2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Chama a tela 2
                startActivity(new Intent(Tela3.this, Tela2.class));

                //Para fechar a activity/tela atual
                finish();
            }
        });

        //Referencia o botão finalizar do main.xml
        Button btnFinalizar = (Button) findViewById(R.id.btnFinalizar);
        btnFinalizar.setVisibility(View.VISIBLE);

        //Seta o título do botão finalizar
        btnFinalizar.setText("Finalizar aplicação --> sair");

        //Seta o evento do click do botão finalizar
        btnFinalizar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Para fechar a activity/tela atual
                finish();
            }
        });
    }


}