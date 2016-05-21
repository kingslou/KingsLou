package com.lou.kings.kingslou.injection.component;

import com.lou.kings.kingslou.MainActivity;
import com.lou.kings.kingslou.injection.PerActivity;
import com.lou.kings.kingslou.injection.module.ActivityModule;

import dagger.Component;

/**
 * Created by YiMuTian on 2016/5/21.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
