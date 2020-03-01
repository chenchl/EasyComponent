package cn.chenchl.easycomponent;

import android.content.Context;
import android.util.Log;

import cn.chenchl.easycomponent.lib.EasyInitParam;
import cn.chenchl.easycomponent.lib.IEasyInit;


/**
 * created by ccl on 2020/2/25
 **/
@EasyInitParam(priority = 1)
public class ComponentMainInit implements IEasyInit {
    @Override
    public void init(Context context) {
        Log.e("Component", "init Main " + context.getPackageName());
    }
}
