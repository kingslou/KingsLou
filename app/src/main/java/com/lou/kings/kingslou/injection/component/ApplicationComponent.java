package com.lou.kings.kingslou.injection.component;

import com.lou.kings.kingslou.App;
import com.lou.kings.kingslou.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by YiMuTian on 2016/5/21.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(App app);
}
