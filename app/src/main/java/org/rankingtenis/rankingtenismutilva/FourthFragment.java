package org.rankingtenis.rankingtenismutilva;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FourthFragment extends Fragment {

	// Store instance variables
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static Fragment newInstance(int page, String title) {
        FourthFragment fragmentFourth = new FourthFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFourth.setArguments(args);
        return fragmentFourth;
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
        View view = inflater.inflate(R.layout.fragment_fourth, container, false);
        TextView t41 = (TextView) view.findViewById(R.id.t41);
        TextView t42 = (TextView) view.findViewById(R.id.t42);
        TextView t43 = (TextView) view.findViewById(R.id.t43);
        TextView t44 = (TextView) view.findViewById(R.id.t44);
        TextView t45 = (TextView) view.findViewById(R.id.t45);
        TextView t46 = (TextView) view.findViewById(R.id.t46);
        TextView t47 = (TextView) view.findViewById(R.id.t47);
        TextView t48 = (TextView) view.findViewById(R.id.t48);
        TextView t49 = (TextView) view.findViewById(R.id.t49);
        TextView t410 = (TextView) view.findViewById(R.id.t410);
        TextView t411 = (TextView) view.findViewById(R.id.t411);
        TextView t412 = (TextView) view.findViewById(R.id.t412);
        TextView t413 = (TextView) view.findViewById(R.id.t413);
        TextView t414 = (TextView) view.findViewById(R.id.t414);

        t41.setText("Grupo 1");
        t42.setText("J.Caño - F.Melero:");
        t43.setText("J.Caño - R.Montenegro:");
        t44.setText("J.Caño - P.Moreno:");
        t45.setText("F.Melero - P.Moreno:");
        t46.setText("F.Melero - R.Montenegro:");
        t47.setText("P.Moreno - R.Montenegro:");

        t48.setText("Grupo 2");
        t49.setText("J.Rodriguez - F.Elcarte:");
        t410.setText("J.Rodriguez - I.Bru:");
        t411.setText("J.Rodriguez - S.Savov:");
        t412.setText("F.Elcarte - S.Savov:");
        t413.setText("F.Elcarte - I.Bru:");
        t414.setText("I.Bru - S.Savov:");

        return view;
    }
	

}
