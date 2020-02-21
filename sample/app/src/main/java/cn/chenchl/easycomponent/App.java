package cn.chenchl.easycomponent;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * created by ccl on 2020/2/21
 **/
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}
