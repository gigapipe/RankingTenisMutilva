package org.rankingtenis.rankingtenismutilva;

import java.util.Vector;

import org.rankingtenis.rankingtenismutilva.PlayersList.Jugador;

import android.app.Activity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MyList extends Activity {

	TableLayout country_table;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);
        country_table=(TableLayout)findViewById(R.id.tabla_jugadores);
        fillCountryTable();
    }
    void fillCountryTable() {
 
        TableRow row;
        TextView t1, t2;
        //Converting to dip unit
        int dip = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                (float) 1, getResources().getDisplayMetrics());
 
        PlayersList c = new PlayersList();
        Vector<Jugador> jug = c.getJugadores();
        for (int current = 0; current < jug.size(); current++) {
            row = new TableRow(this);
 
            t1 = new TextView(this);
            t2 = new TextView(this);
 
            t1.setText(jug.get(current).getNombre());
            t2.setText(jug.get(current).getTelefono());
 
            t1.setTypeface(null, 1);
            t2.setTypeface(null, 1);
 
            t1.setTextSize(15);
            t2.setTextSize(15);
 
            t1.setWidth(50 * dip);
            t2.setWidth(150 * dip);
            t1.setPadding(20*dip, 0, 0, 0);
            row.addView(t1);
            row.addView(t2);
 
            country_table.addView(row, new TableLayout.LayoutParams(
                    LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
 
        }
    }
}
