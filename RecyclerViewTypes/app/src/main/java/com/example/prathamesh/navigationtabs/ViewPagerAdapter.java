package com.example.prathamesh.navigationtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PRATHAMESH on 16-02-2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> lstfragment = new ArrayList<>();
    private final List<String> lstTitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return lstfragment.get(position);
    }

    @Override
    public int getCount() {
        return lstTitle.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return lstTitle.get(position);
    }


    public void AddFragment(Fragment fragment, String title){
        lstfragment.add(fragment);
        lstTitle.add(title);
    }



}

