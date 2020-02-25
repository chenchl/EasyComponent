package cn.chenchl.easycomponent;

import android.content.Context;
import android.util.Log;

import cn.chenchl.easycomponent.lib.IEasyInit;


/**
 * created by ccl on 2020/2/25
 **/
public class ComponentMainAInit implements IEasyInit {
    @Override
    public void init(Context context) {
        Log.e("Component","init Main A");
    }
}
