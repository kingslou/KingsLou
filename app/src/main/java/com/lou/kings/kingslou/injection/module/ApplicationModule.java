package com.lou.kings.kingslou.injection.module;

import android.app.Application;
import android.content.Context;

import com.lou.kings.kingslou.injection.ApplicationContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by YiMuTian on 2016/5/21.
 */

@Module
public class ApplicationModule {
    protected Application application;

    public ApplicationModule(Application application){this.application = application;}

    @Provides Application providerApplication(){return application;}

    @Provides
    @ApplicationContext
    Context providerContext(){return application;}



}
