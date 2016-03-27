package com.example.umibiox.appet_proto;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by umibiox on 3/26/16.
 */
public class WalkthroughPagerAdapter extends FragmentPagerAdapter {



    public WalkthroughPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        return new WalkthroughItemFragment();
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 4;
    }
}
