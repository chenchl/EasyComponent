package cn.chenchl.easycomponent.sample.componenta;

import android.content.Context;
import android.util.Log;

import cn.chenchl.easycomponent.lib.IEasyInit;


/**
 * created by ccl on 2020/2/25
 **/

public class ComponentAInit implements IEasyInit {
    @Override
    public void init(Context context) {
        Log.e("Component","init A");
    }
}
