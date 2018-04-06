package com.example.student.finalversion;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

/**
 * Created by student on 4/5/18.
 */

public class PagerAdapter extends FragmentStatePagerAdapter
{

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0:
                to_do to_do = new to_do();
                return to_do;
            case 1:
                do_ing do_ing = new do_ing();
                return do_ing;
            case 2:
                done done = new done();
                return done;
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
