package com.example.android.fragmentimages;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentImageView.OnClickImage{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public void setImage(Drawable drawable) {
        FragmentImageViewResult result = (FragmentImageViewResult)getFragmentManager().findFragmentById(R.id.fragmentResult);
        result.setResultImage(drawable);
    }
}
