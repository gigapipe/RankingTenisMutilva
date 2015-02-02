package org.rankingtenis.rankingtenismutilva;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Ranking extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ranking);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ranking, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void lanzarCreditos(View view){

	      Intent i = new Intent(this, Creditos.class);
	      startActivity(i);

	}
	
	public void lanzarJugadores(View view){

	      Intent i = new Intent(this, Jugadores.class);
	      startActivity(i);

	}
	
	public void lanzarGrupos(View view){

	      Intent i = new Intent(this, Grupos.class);
	      startActivity(i);

	}

    public void lanzarClasificacion(View view){

        Intent i = new Intent(this, Clasificacion.class);
        startActivity(i);

    }

    public void lanzarPreferencias(View view){

        Intent i = new Intent(this, Preferencias.class);
        startActivity(i);

    }
}
