package cn.chenchl.easycomponent.sample.componenta;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;

import androidx.appcompat.app.AppCompatActivity;
import cn.chenchl.easycomponent.lib_router.ComponentService;
// demo中componenta独立运行
// debug版本包含组件A和组件B 则编译安装后组件A跳转组件B均正常
// release版本只包含组件A 则编译安装后组件A无法跳转组件B
@Route(path = ComponentService.COMPONENTA_PATH, name = "A页面")
public class AActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        findViewById(R.id.btn_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(ComponentService.COMPONENTB_PATH).navigation(AActivity.this, new NavigationCallback() {
                    @Override
                    public void onFound(Postcard postcard) {
                        Toast.makeText(getApplicationContext(), "postCard " + postcard.toString(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLost(Postcard postcard) {
                        Toast.makeText(getApplicationContext(), "postCard Lost" + postcard.toString(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onArrival(Postcard postcard) {

                    }

                    @Override
                    public void onInterrupt(Postcard postcard) {

                    }
                });
            }
        });
    }
}
