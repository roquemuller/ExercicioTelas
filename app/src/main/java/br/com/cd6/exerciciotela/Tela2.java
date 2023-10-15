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

public class Tela2 extends ExemploCicloVida {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("Você está na Tela 2");

        //Referencia o botão navegar do main.xml
        Button btnTela3 = (Button)findViewById(R.id.btnNavegar);
        
        //Seta o título do botão
        btnTela3.setText("Próximo --> Tela 3" );
        
        //Seta o evento do click do botão
        btnTela3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Chama a tela 3
				startActivity(new Intent(Tela2.this, Tela3.class));
				
				//Para fechar a activity/tela atual
				finish();
			}
		});
    }

}