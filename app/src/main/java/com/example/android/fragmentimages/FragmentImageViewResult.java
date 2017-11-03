package com.example.android.fragmentimages;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Android on 03.04.2017.
 */

public class FragmentImageViewResult extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.fragment_imageview_result,container);
    }


    public void setResultImage(Drawable drawable)
    {
        ((ImageView)getView().findViewById(R.id.imageResult)).setImageDrawable(drawable);
    }
}
