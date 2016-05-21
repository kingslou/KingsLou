package com.lou.kings.kingslou.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by YiMuTian on 2016/5/21.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
