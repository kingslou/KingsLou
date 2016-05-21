package com.lou.kings.kingslou;

import android.app.Application;
import android.content.Context;

import com.lou.kings.kingslou.injection.component.ApplicationComponent;
import com.lou.kings.kingslou.injection.component.DaggerApplicationComponent;
import com.lou.kings.kingslou.injection.module.ApplicationModule;

/**
 * Created by YiMuTian on 2016/5/21.
 */
public class App extends Application {

    private static App app;
    ApplicationComponent applicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public void setApplicationComponent(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    public static App getAppInstance(){
        return app;
    }

    public static App get(Context context){
        return (App)context.getApplicationContext();
    }
}
