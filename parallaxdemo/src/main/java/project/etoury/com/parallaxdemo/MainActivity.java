package project.etoury.com.parallaxdemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager vp = (ViewPager) findViewById(R.id.vp);
        MyAdapter mPagerAdapter = new MyAdapter(getSupportFragmentManager());
        vp.setAdapter(mPagerAdapter);
        int[] i = {R.id.iv};
        //可以设置滑动速率
        vp.setPageTransformer(true, new ParallaxTransformer(0.5f, 0,i, true));
    }
}
