package com.lou.kings.kingslou.injection.module;

import android.app.Activity;
import android.content.Context;

import com.lou.kings.kingslou.injection.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by YiMuTian on 2016/5/21.
 */
@Module
public class ActivityModule {
    private Activity activity;

    public ActivityModule(Activity activity){this.activity = activity;}

    @Provides
    Activity provideActivity() {
        return activity;
    }

    @Provides
    @ActivityContext
    Context providesContext() {
        return activity;
    }
}
