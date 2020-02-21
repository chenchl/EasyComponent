package cn.chenchl.easycomponent.sample.componentb;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import cn.chenchl.easycomponent.lib_router.ComponentService;
import androidx.appcompat.app.AppCompatActivity;

@Route(path = ComponentService.COMPONENTB_PATH, name = "B页面")
public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
}
