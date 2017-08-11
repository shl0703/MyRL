package com.shl.rlim.base;

import android.app.Application;

import org.xutils.x;

public class BaseApplication extends Application {

    private static BaseApplication baseApplication;

    public synchronized static BaseApplication getInstance() {
        return baseApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
        x.Ext.init(this);
        //全局异常捕获
//        CrashHandler.getInstance().init(this);
    }
}
