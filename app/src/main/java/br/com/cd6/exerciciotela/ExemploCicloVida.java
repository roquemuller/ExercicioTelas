package br.com.cd6.exerciciotela;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ExemploCicloVida extends AppCompatActivity {
	
	protected static final String CATEGORIA = "CD6";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(CATEGORIA, getClass()+".onCreate() chamado: " + savedInstanceState);
        TextView t = new TextView(this);
        t.setText(getString(R.string.exemplo_de_ciclo_de_vida));
        
        setContentView(t);
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	Log.i(CATEGORIA, getClassName() + ".onStart() chamado");
    }
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	Log.i(CATEGORIA, getClassName() + ".onRestart() chamado");
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.i(CATEGORIA, getClassName() + ".onResume() chamado");
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	Log.i(CATEGORIA, getClassName() + ".onPause() chamado");
    }
    
    @Override
    protected void onStop() {
    	super.onStop();
    	Log.i(CATEGORIA, getClassName() + ".onStop() chamado");
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	Log.i(CATEGORIA, getClassName() + ".onDestroy() chamado");
    }

    private String getClassName() {
    	String s = getClass().getName();
    	return s.substring(s.lastIndexOf("."));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, getString(R.string.disponivel_para_a_implementacao_do_programador), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
