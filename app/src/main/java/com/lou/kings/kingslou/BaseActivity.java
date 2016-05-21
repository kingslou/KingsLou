package com.lou.kings.kingslou;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.lou.kings.kingslou.injection.component.ActivityComponent;
import com.lou.kings.kingslou.injection.component.DaggerActivityComponent;
import com.lou.kings.kingslou.injection.module.ActivityModule;

/**
 * Created by YiMuTian on 2016/5/21.
 */
public class BaseActivity extends AppCompatActivity {

    private ActivityComponent activityComponent;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    public ActivityComponent activityComponent(){
        if(activityComponent==null){
            activityComponent = DaggerActivityComponent.builder()
                    .activityModule(new ActivityModule(this))
                    .applicationComponent(App.get(this).getApplicationComponent())
                    .build();
        }
        return activityComponent;
    }

}
