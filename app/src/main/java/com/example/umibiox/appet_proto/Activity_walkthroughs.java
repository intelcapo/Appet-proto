package com.example.umibiox.appet_proto;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_walkthroughs extends ActionBarActivity {

    // UI References
    private ViewPager mWalkthroughViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthroughs);

        // Get references
        mWalkthroughViewPager = (ViewPager) findViewById(R.id.walkthroughViewPager);

        // Set adapter
        FragmentManager fragmentManager = getSupportFragmentManager();
        WalkthroughPagerAdapter adapter = new WalkthroughPagerAdapter(fragmentManager);
        mWalkthroughViewPager.setAdapter(adapter);
    }
}
