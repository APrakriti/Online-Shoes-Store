package com.aprakriti.shoesstore.Adapter;

/**
 * Created by aryans on 12/7/2016.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.aprakriti.shoesstore.Fragment.TabFragment1;
import com.aprakriti.shoesstore.Fragment.TabFragment1A;
import com.aprakriti.shoesstore.Fragment.TabFragment2;
import com.aprakriti.shoesstore.Fragment.TabFragment2A;
import com.aprakriti.shoesstore.Fragment.TabFragment3;


public class PagerrAAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerrAAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TabFragment1A tab1A = new TabFragment1A();
                return tab1A;
            case 1:
                TabFragment2A tab2A = new TabFragment2A();
                return tab2A;
                       default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
