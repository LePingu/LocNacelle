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
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TabWidget;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AssistanceFragment extends Fragment {


    private FragmentTabHost mTabHost;
    Typeface typeface;
    Toolbar myToolBar;

    public AssistanceFragment() {
        // Required empty public constructor
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        //myToolBar = (Toolbar) getView().findViewById(R.id.toolbar);
        //myToolBar.setNavigationIcon(getResources().getDrawable(R.drawable.abc_ic_ab_back_mtrl_am_alpha));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        typeface = Typeface.createFromAsset(getActivity().getAssets(), "bebasneue.ttf");

        View rootview = inflater.inflate(R.layout.fragment_assistance, container, false);

        mTabHost = (FragmentTabHost)rootview.findViewById(android.R.id.tabhost);

        mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.realasstabcontent);

        mTabHost.getTabWidget().setDividerDrawable(R.color.tab_color);

        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator(getTabIndicator(mTabHost.getContext(), R.string.tab_title_ass1)), MiseFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator(getTabIndicator(mTabHost.getContext(), R.string.tab_title_ass2)), DepannageFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator(getTabIndicator(mTabHost.getContext(), R.string.tab_title_ass3)), ElementFragment.class, null);
        //mTabHost.addTab(mTabHost.newTabSpec("tab4").setIndicator(getTabIndicator(mTabHost.getContext(), R.string.tab_title_ass4)), MiseFragment.class, null);
        //mTabHost.addTab(mTabHost.newTabSpec("tab5").setIndicator(getTabIndicator(mTabHost.getContext(), R.string.tab_title_ass5)), MiseFragment.class, null);


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
        tv.setTextSize(15);
        tv.setText(title);
        tv.setTypeface(typeface);
        return view;
    }


}
