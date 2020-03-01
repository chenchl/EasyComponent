package cn.chenchl.easycomponent.sample.componentb;

import android.content.Context;
import android.util.Log;

import cn.chenchl.easycomponent.lib.EasyInitParam;
import cn.chenchl.easycomponent.lib.IEasyInit;

/**
 * created by ccl on 2020/2/25
 **/
@EasyInitParam(priority = 3)
public class ComponentBInit implements IEasyInit {
    @Override
    public void init(Context context) {
        Log.e("Component","init B");
    }
}
