package org.rankingtenis.rankingtenismutilva;
import org.rankingtenis.rankingtenismutilva.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment{
	
	// Store instance variables
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static android.support.v4.app.Fragment newInstance(int page, String title) {
    	SecondFragment fragmentSecond = new SecondFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentSecond.setArguments(args);
        return fragmentSecond;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        TextView t21 = (TextView) view.findViewById(R.id.t21);
        TextView t22 = (TextView) view.findViewById(R.id.t22);
        TextView t23 = (TextView) view.findViewById(R.id.t23);
        TextView t24 = (TextView) view.findViewById(R.id.t24);
        TextView t25 = (TextView) view.findViewById(R.id.t25);
        TextView t26 = (TextView) view.findViewById(R.id.t26);
        TextView t27 = (TextView) view.findViewById(R.id.t27);
        TextView t28 = (TextView) view.findViewById(R.id.t28);
        TextView t29 = (TextView) view.findViewById(R.id.t29);
        TextView t210 = (TextView) view.findViewById(R.id.t210);
        TextView t211 = (TextView) view.findViewById(R.id.t211);
        TextView t212 = (TextView) view.findViewById(R.id.t212);
        TextView t213 = (TextView) view.findViewById(R.id.t213);
        TextView t214 = (TextView) view.findViewById(R.id.t214);

        t21.setText("Grupo 1");
        t22.setText("I.Izuriaga - J.Caño: 2/6 3/6");
        t23.setText("I.Izuriaga - F.Melero: 0/6 1/6");
        t24.setText("I.Izuriaga - M.Menéndez: 6/0 6/0");
        t25.setText("J.Caño - M.Menendez: 6/1 6/3");
        t26.setText("J.Caño - F.Melero: 4/6 6/2 6/2");
        t27.setText("F.Melero - M.Menédez: 6/2 7/6");

        t28.setText("Grupo 2");
        t29.setText("J.Bru - J.Rodríguez: 4/6 4/6");
        t210.setText("J.Bru - F.Elcarte: 2/6 1/6");
        t211.setText("J.Bru - J.L.López: 6/2 6/0");
        t212.setText("J.L.López - F.Elcarte: 0/6 1/6");
        t213.setText("J.L.López - J.Rodríguez: 2/6 1/6");
        t214.setText("J.Rodríguez - F.Elcarte: 0/6 2/6");

        return view;
    }
	


}
