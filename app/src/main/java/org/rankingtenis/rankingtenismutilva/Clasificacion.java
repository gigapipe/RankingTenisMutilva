package org.rankingtenis.rankingtenismutilva;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


public class Clasificacion extends Activity {

    String[][] results = {{"Jugador",       "PT", "J",  "G", "P", "NJ", "H"},
                            {"J.Caño",      "62", "10", "9", "0", "1",  "+34"},
                            {"F.Melero",    "57", "10", "7", "3", "0",  "+36"},
                            {"R.Montenegro","53", "11", "8", "2", "1",  "+28"},
                            {"F.Elcarte",   "51", "10", "6", "3", "1",  "+32"},
                            {"P.Moreno",    "48", "11", "7", "3", "1",  "+26"},
                            {"J.Rodríguez", "44", "10", "3", "6", "1",  "+34"},
                            {"M.Menéndez",  "43", "10", "3", "7", "0",  "+34"},
                            {"I.Izuriaga",  "33", "10", "5", "5", "0",  "+34"},
                            {"J.Bru",       "28", "10", "3", "6", "1",  "+30"},
                                                            };

	
	TableLayout tabla_clasificacion;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasificacion);
        tabla_clasificacion=(TableLayout)findViewById(R.id.tabla_clasificacion);
        rellenarTablaClasificacion();
    }
    void rellenarTablaClasificacion() {
 
        TableRow row;
        TextView t1;
        //Converting to dip unit
        int dip = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                (float) 1, getResources().getDisplayMetrics());
 
        // Filas: PT, J, G, P, NJ, H
        
        //for (int current = 0; current < 9; current++) {
        t1 = new TextView(this);
        for(int r = 0;r<results.length; r++) {

            row = new TableRow(this);
            for (int c = 0; c < results[r].length; c++) {

                t1 = new TextView(this);
                t1.setText(results[r][c]);
                t1.setTypeface(null, 1);
                if(r==0){
                    t1.setTextColor(Color.parseColor("#2E2E2E"));
                    t1.setTextSize(20);
                }
                else{
                    t1.setTextSize(15);
                    t1.setTextColor(Color.parseColor("#848484"));
                }
                row.addView(t1);

            }
            tabla_clasificacion.addView(row, new TableLayout.LayoutParams(
                    LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        }

        //}
    }
}
