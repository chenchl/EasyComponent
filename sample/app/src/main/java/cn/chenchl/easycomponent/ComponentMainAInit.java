package cn.chenchl.easycomponent;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

import cn.chenchl.easycomponent.lib.IEasyInit;


/**
 * created by ccl on 2020/2/25
 **/
public class ComponentMainAInit implements IEasyInit {
    @Override
    public void init(Context context) {
        ARouter.init((Application) context);
        Log.e("Component","init Main A");
    }
}
