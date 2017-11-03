package com.example.android.fragmentimages;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * Created by Android on 02.04.2017.
 */

public class FragmentImageView extends Fragment {

    Integer[] images = {R.drawable.index1, R.drawable.index2,
            R.drawable.index3, R.drawable.index4, R.drawable.index5, R.drawable.index6 };

    ImageView imageView;

    private OnClickImage listener;

    interface  OnClickImage
    {
        void setImage(Drawable drawable);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_imageview,container);
        imageView = (ImageView) view.findViewById(R.id.image);
        int num = Integer.parseInt(this.getTag().toString());
        imageView.setImageResource(images[num]);
        //imageView.setImageResource(images[Integer.parseInt(imageView.getTag().toString())]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = imageView.getDrawable();
                listener.setImage(drawable);
            }
        });

        return view;
    }




    @TargetApi(23)
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentImageView.OnClickImage)
            listener  = (OnClickImage) context;
        else throw  new ClassCastException("error: implement callback");

    }

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof FragmentImageView.OnClickImage)
            listener = (OnClickImage) activity;
        else throw  new ClassCastException("error: implement callback");
    }
}


