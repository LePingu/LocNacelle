package com.example.hatim.locnacelle;


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TabWidget;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FormationFragment extends Fragment {


    private FragmentTabHost mTabHost;
    Typeface typeface;

    public FormationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        typeface = Typeface.createFromAsset(getActivity().getAssets(), "bebasneue.ttf");

        View rootview = inflater.inflate(R.layout.fragment_formation, container, false);

        mTabHost = (FragmentTabHost)rootview.findViewById(android.R.id.tabhost);

        mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.realtabcontentformation);

        mTabHost.getTabWidget().setDividerDrawable(R.color.tab_color);

        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator(getTabIndicator(mTabHost.getContext(), R.string.tab_title_cert1)), ReglFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator(getTabIndicator(mTabHost.getContext(), R.string.tab_title_cert2)), CertifFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator(getTabIndicator(mTabHost.getContext(), R.string.tab_title_cert3)), ProgFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab4").setIndicator(getTabIndicator(mTabHost.getContext(), R.string.tab_title_cert4)), EvalFragment.class, null);

        TabWidget tw = mTabHost.getTabWidget();
        LinearLayout ll = (LinearLayout) tw.getParent();
        HorizontalScrollView hs = new HorizontalScrollView(getActivity());
        hs.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT));
        ll.addView(hs, 0);
        ll.removeView(tw);
        hs.addView(tw);
        hs.setHorizontalScrollBarEnabled(false);

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
