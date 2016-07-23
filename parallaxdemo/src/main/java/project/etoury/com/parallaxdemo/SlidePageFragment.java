package project.etoury.com.parallaxdemo;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/**
 * Created by shaoze on 2016/6/29.
 */
public class SlidePageFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(
                R.layout.layout_fragment, container, false);
        final ImageView iv = (ImageView) view.findViewById(R.id.iv);
        int index = getArguments().getInt("my",0);
        switch (index){
            case 0:
                iv.setImageResource(R.mipmap.duizhang);
                break;
            case 1:
                iv.setImageResource(R.mipmap.gangtie);
                break;
            case 2:
                iv.setImageResource(R.mipmap.leishen);
                break;
            case 3:
                iv.setImageResource(R.mipmap.lvjian);
                break;
            case 4:
                iv.setImageResource(R.mipmap.quanjia);
                break;
        }

        return view;
    }
}
