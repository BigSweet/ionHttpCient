package com.anlaiye.swt.ionhttpclient;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.anlaiye.swt.ionhttpclient.listener.RequestListner;
import com.anlaiye.swt.ionhttpclient.model.AdListBean;
import com.anlaiye.swt.ionhttpclient.model.DataSource;
import com.anlaiye.swt.ionhttpclient.result.ResultMessage;
import com.facebook.drawee.view.SimpleDraweeView;


public class MainActivity extends AppCompatActivity {
    private SimpleDraweeView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sv = (SimpleDraweeView) findViewById(R.id.simplyview);

        DataSource.getUrl(new RequestListner<AdListBean>(AdListBean.class) {
            @Override
            public boolean onSuccess(AdListBean bean) throws Exception {
                sv.setImageURI("https://pic.anlaiye.com.cn/7636cd7803734dd8a7b7989200aecbd4_750x750.png");
                Toast.makeText(getApplicationContext(), "获取网络图片成功", Toast.LENGTH_SHORT).show();
                return super.onSuccess(bean);
            }

            @Override
            public void onEnd(ResultMessage e) {
                super.onEnd(e);
                if (!e.isSuccess()) {
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}
