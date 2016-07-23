package project.etoury.com.parallaxdemo;

import android.support.v4.view.ViewPager;
import android.view.View;

public class ParallaxTransformer implements ViewPager.PageTransformer {
    private int[] resIds;
    private float speedEffect;
    private float distanceEffect;

    public ParallaxTransformer(float speed,float viewDistance,
                               int[] resIds,boolean isSpeedReverse){
        this.resIds = resIds;
        this.speedEffect = speed;
        this.distanceEffect = viewDistance;
        if (isSpeedReverse)
            this.speedEffect *= -1;
    }
    @Override
    public void transformPage(View page, float position) {

       float moveLength = page.getWidth() * speedEffect;
        for (int i = 0;i < resIds.length; i++){
            View view = page.findViewById(resIds[i]);
            if (view != null){
                view.setTranslationX(moveLength * position);
            }
            moveLength *= distanceEffect;
        }

    }
}
