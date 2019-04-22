package com.st.currencyrate.ui.main;

import android.support.v4.app.Fragment;

import com.st.currencyrate.ui.container.FragmentActivity;

public class MainActivity extends FragmentActivity {

    @Override
    protected Fragment createFragment() {
        return MainFragment.newInstance();
    }
}
