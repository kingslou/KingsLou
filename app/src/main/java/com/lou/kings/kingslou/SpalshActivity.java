package com.lou.kings.kingslou;

import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;

/**
 * Created by YiMuTian on 2016/8/3.
 */
public class SpalshActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },500);
    }

}
