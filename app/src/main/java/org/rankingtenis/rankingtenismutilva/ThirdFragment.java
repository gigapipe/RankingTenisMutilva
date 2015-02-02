package org.rankingtenis.rankingtenismutilva;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ThirdFragment extends Fragment {
	
	// Store instance variables
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static android.support.v4.app.Fragment newInstance(int page, String title) {
        ThirdFragment fragmentThird = new ThirdFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentThird.setArguments(args);
        return fragmentThird;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 1);
        title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        TextView t31 = (TextView) view.findViewById(R.id.t31);
        TextView t32 = (TextView) view.findViewById(R.id.t32);
        TextView t33 = (TextView) view.findViewById(R.id.t33);
        TextView t34 = (TextView) view.findViewById(R.id.t34);
        TextView t35 = (TextView) view.findViewById(R.id.t35);
        TextView t36 = (TextView) view.findViewById(R.id.t36);
        TextView t37 = (TextView) view.findViewById(R.id.t37);
        TextView t38 = (TextView) view.findViewById(R.id.t38);
        TextView t39 = (TextView) view.findViewById(R.id.t39);
        TextView t310 = (TextView) view.findViewById(R.id.t310);
        TextView t311 = (TextView) view.findViewById(R.id.t311);
        TextView t312 = (TextView) view.findViewById(R.id.t312);
        TextView t313 = (TextView) view.findViewById(R.id.t313);
        TextView t314 = (TextView) view.findViewById(R.id.t314);

        t31.setText("Grupo 1");
        t32.setText("J.Rodriguez - F.Melero: 1/6 6/7");
        t33.setText("J.Rodriguez - J.Caño: 1/6 2/6");
        t34.setText("J.Rodriguez - F.Elcarte: 7/6 4/4");
        t35.setText("J.Caño - F.Melero: 6/3 1/6 6/0");
        t36.setText("J.Caño - F.Elcarte: 7/6 6/2");
        t37.setText("F.Melero - F.Elcarte: 7/5 6/2");

        t38.setText("Grupo 2");
        t39.setText("I.Izuriaga - M.Menéndez: 7/6 7/5");
        t310.setText("I.Izuriaga - R.Montenegro: 7/5 6/2");
        t311.setText("I.Izuriaga - P.Moreno: 6/7 2/6 5/7"); 
        t312.setText("P.Moreno - M.Menéndez: 6/3 6/2");
        t313.setText("P.Moreno - R.Montenegro: 4/6 0/6");
        t314.setText("R.Montenegro - M.Menéndez: 6/1 6/1");

        return view;
    }
	

}
