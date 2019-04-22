package com.st.currencyrate.ui.settings;

import android.support.v4.app.Fragment;

import com.st.currencyrate.ui.container.FragmentActivity;

public class SettingActivity extends FragmentActivity {
    @Override
    protected Fragment createFragment() {
        return SettingFragment.newInstance();
    }
}
