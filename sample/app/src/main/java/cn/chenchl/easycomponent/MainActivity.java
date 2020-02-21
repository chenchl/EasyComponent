package cn.chenchl.easycomponent;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;

import cn.chenchl.easycomponent.lib_router.ComponentService;

import androidx.appcompat.app.AppCompatActivity;

// demo中app作为host工程
// debug版本包含host和组件A和组件B 则编译安装后跳转组件A 组件B均正常
// release版本只包含host和组件A 则编译安装后只能跳转组件A 组件B无法跳转
@Route(path = ComponentService.MAIN_PATH, name = "主页面")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(ComponentService.COMPONENTA_PATH).navigation(MainActivity.this, new NavigationCallback() {
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
        findViewById(R.id.btn_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(ComponentService.COMPONENTB_PATH).navigation(MainActivity.this, new NavigationCallback() {
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
