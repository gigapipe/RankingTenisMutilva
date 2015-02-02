package org.rankingtenis.rankingtenismutilva;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FirstFragment extends Fragment {
	
	

    // newInstance constructor for creating fragment with arguments
    public static android.support.v4.app.Fragment newInstance(int page, String title) {
        FirstFragment fragmentFirst = new FirstFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        TextView t11 = (TextView) view.findViewById(R.id.t11);
        TextView t12 = (TextView) view.findViewById(R.id.t12);
        TextView t13 = (TextView) view.findViewById(R.id.t13);
        TextView t14 = (TextView) view.findViewById(R.id.t14);
        TextView t15 = (TextView) view.findViewById(R.id.t15);
        TextView t16 = (TextView) view.findViewById(R.id.t16);
        TextView t17 = (TextView) view.findViewById(R.id.t17);
        TextView t18 = (TextView) view.findViewById(R.id.t18);
        TextView t19 = (TextView) view.findViewById(R.id.t19);
        TextView t110 = (TextView) view.findViewById(R.id.t110);
        TextView t111 = (TextView) view.findViewById(R.id.t111);
        TextView t112 = (TextView) view.findViewById(R.id.t112);
        TextView t113 = (TextView) view.findViewById(R.id.t113);
        TextView t114 = (TextView) view.findViewById(R.id.t114);
        TextView t115 = (TextView) view.findViewById(R.id.t115);
        TextView t116 = (TextView) view.findViewById(R.id.t116);
        TextView t117 = (TextView) view.findViewById(R.id.t117);
        TextView t118 = (TextView) view.findViewById(R.id.t118);
        TextView t119 = (TextView) view.findViewById(R.id.t119);
        TextView t120 = (TextView) view.findViewById(R.id.t120);
        TextView t121 = (TextView) view.findViewById(R.id.t121);
        TextView t122 = (TextView) view.findViewById(R.id.t122);

        t11.setText("Grupo 1");
        t12.setText("J.Rodriguez - J.Bru: 6/0 5/7 3/6");
        t13.setText("J.Rodriguez - F.Melero: 3/6 5/7");
        t14.setText("J.Rodriguez - I.Izuriaga: 6/1 1/6 7/5");
        t15.setText("J.Rodriguez - M.Menendez: 1/6 3/6");
        t16.setText("J.Bru - F.Melero: 0/6 1/6");
        t17.setText("J.Bru - M.Menédez: 6/3 4/6 3/6");
        t18.setText("J.Bru - I.Izuriaga: 3/6 3/6");
        t19.setText("F.Melero - I.Izuriaga: 6/4 4/6 3/6");
        t110.setText("F.Melero - M.Menéndez: 7/6 6/4");
        t111.setText("M.Menéndez - I.Izuriaga: 6/4 6/4");

        t112.setText("Grupo 2");
        t113.setText("J.L.López - I.Iribarren: 4/6 1/6");
        t114.setText("J.L.López - F.Elcarte: 0/6 1/6");
        t115.setText("J.L.López - J.Caño: 0/6 2/6");
        t116.setText("J.L.López - M.Pulido: 0/0 0/0");
        t117.setText("F.Elcarte - I.Iribarren: 6/1 6/1");
        t118.setText("F.Elcarte - M.Pulido: 6/4 6/4");
        t119.setText("F.Elcarte - J.Caño: 6/4 0/6 6/10");
        t120.setText("J.Caño - I.Iribarren: 6/4 6/0");
        t121.setText("J.Caño - M.Pulido: 0/0 0/0");
        t122.setText("M.Pulido - I.Iribarren: 7/6 6/1");

        return view;
    }
	

}
