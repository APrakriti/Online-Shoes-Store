package com.prakriti.myapplication.Adapter;

/**
 * Created by aryans on 12/7/2016.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.prakriti.myapplication.Fragment.TabFragment1;
import com.prakriti.myapplication.Fragment.TabFragment2;
import com.prakriti.myapplication.Fragment.TabFragment3;


public class PagerrAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerrAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TabFragment1 tab1 = new TabFragment1();
                return tab1;
            case 1:
                TabFragment2 tab2 = new TabFragment2();
                return tab2;
            case 2:
                TabFragment3 tab3 = new TabFragment3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
