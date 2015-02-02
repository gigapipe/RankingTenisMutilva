package org.rankingtenis.rankingtenismutilva;

import java.util.Vector;

import org.rankingtenis.rankingtenismutilva.AlmacenJugadoresSQLite.Jugador;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class Jugadores extends Activity {

	public AlmacenJugadores almacen=
            new AlmacenJugadoresSQLite(this, "jugadores", null, 1);
	
	TableLayout tabla_jugadores;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadores);
        tabla_jugadores=(TableLayout)findViewById(R.id.tabla_jugadores);
        rellenarTablaJugadores();
    }
    void rellenarTablaJugadores() {
 
        TableRow row;
        TextView t1, t2, t3;
        //Converting to dip unit
        int dip = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                (float) 1, getResources().getDisplayMetrics());
 
        PlayersList c = new PlayersList();
        almacen.deleteJugadores();
        almacen.insertarJugadores();
        //Vector<Jugador> jug = c.getJugadores();
        Vector<Jugador> jug = almacen.listaJugadores();

        row = new TableRow(this);
        t1 = new TextView(this);
        t2 = new TextView(this);
        t3 = new TextView(this);
        t1.setText("Nombre");
        t2.setText("Teléfono");
        t3.setText("Email");
        t1.setTypeface(null, 1);
        t2.setTypeface(null, 1);
        t3.setTypeface(null, 1);
        t1.setTextColor(Color.parseColor("#2E2E2E"));
        t2.setTextColor(Color.parseColor("#2E2E2E"));
        t3.setTextColor(Color.parseColor("#2E2E2E"));
        t1.setTextSize(20);
        t2.setTextSize(20);
        t3.setTextSize(20);
        row.addView(t1);
        row.addView(t2);
        row.addView(t3);
        tabla_jugadores.addView(row, new TableLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

        for (int current = 0; current < jug.size(); current++) {
            row = new TableRow(this);
 
            t1 = new TextView(this);
            t2 = new TextView(this);
            t3 = new TextView(this);
 
            t1.setText(jug.get(current).getNombre());
            t2.setText(jug.get(current).getTelefono());
            t3.setText(jug.get(current).getEmail());
 
            t1.setTypeface(null, 1);
            t2.setTypeface(null, 1);
            t3.setTypeface(null, 1);

            t1.setTextSize(15);
            t2.setTextSize(15);
            t3.setTextSize(15);
            t1.setTextColor(Color.parseColor("#848484"));
            t2.setTextColor(Color.parseColor("#848484"));
            t3.setTextColor(Color.parseColor("#848484"));


            row.addView(t1);
            row.addView(t2);
            row.addView(t3);
 
            tabla_jugadores.addView(row, new TableLayout.LayoutParams(
                    LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
 
        }
    }
}
