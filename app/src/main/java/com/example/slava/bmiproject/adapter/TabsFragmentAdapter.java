package com.example.slava.bmiproject.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.slava.bmiproject.fragments.BMIFragmentMan;
import com.example.slava.bmiproject.fragments.BMIFragmentWoman;

import java.util.List;

public class TabsFragmentAdapter extends FragmentPagerAdapter {
    private List<String> mList;

    public TabsFragmentAdapter(FragmentManager fragmentManager, List<String> list) {
        super(fragmentManager);
        mList = list;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return BMIFragmentMan.getInstance();
            case 1:
                return BMIFragmentWoman.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}