package com.lou.kings.kingslou.interfaces;

/**
 * Created by YiMuTian on 2016/6/10.
 */
public interface CallBack<T> {

    void success(T args);

    void error(int errorCode);

}
