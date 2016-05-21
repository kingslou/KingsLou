package com.lou.kings.kingslou.injection;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by YiMuTian on 2016/5/21.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME) //在运行时有效（即运行时保留）
//表示需要在什么级别保存该注释信息，用于描述注解的生命周期（即：被描述的注解在什么范围内有效）
public @interface ApplicationContext {

}
