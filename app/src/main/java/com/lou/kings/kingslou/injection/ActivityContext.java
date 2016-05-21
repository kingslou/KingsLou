package com.lou.kings.kingslou.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by YiMuTian on 2016/5/21.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityContext {
}
