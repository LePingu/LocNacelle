package com.example.hatim.locnacelle;


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Type;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdministrationFragment extends Fragment {


    private FragmentTabHost mTabHost;
    Typeface typeface;

    public AdministrationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        typeface = Typeface.createFromAsset(getActivity().getAssets(), "bebasneue.ttf");

        View rootview = inflater.inflate(R.layout.fragment_administration, container, false);

        mTabHost = (FragmentTabHost)rootview.findViewById(android.R.id.tabhost);

        mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.realtabcontent);

        mTabHost.getTabWidget().setDividerDrawable(R.color.tab_color);

        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator(getTabIndicator(mTabHost.getContext(), R.string.tab_title_1)), SocietyFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator(getTabIndicator(mTabHost.getContext(), R.string.tab_title_2)), ContactFragment.class, null);


        return rootview;


    }

    private View getTabIndicator(Context context, int title) {
        View view = LayoutInflater.from(context).inflate(R.layout.tab_layout, null);
        //ImageView iv = (ImageView) view.findViewById(R.id.imageView);
        //iv.setImageResource(icon);
        TextView tv = (TextView) view.findViewById(R.id.tabText);
        tv.setText(title);
        tv.setTypeface(typeface);
        return view;
    }


}
