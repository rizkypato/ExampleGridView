package com.example.examplegridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class ImageAdapter extends BaseAdapter {

    private Context ctx;

    public ImageAdapter(Context context){

        ctx = context;
    }

    @Override
    public int getCount() {
        return logo.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        ImageView imgView;

        if (convertview == null){
            imgView = new ImageView(ctx);
            imgView.setLayoutParams(new ViewGroup.LayoutParams(150, 150));
            imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imgView.setPadding(8, 8, 8, 8);
        }else {
            imgView = (ImageView) convertview;
        }

        imgView.setImageResource(logo[position]);
        return imgView;

    }



    public Integer[] logo = {R.drawable.logo1, R.drawable.logo2, R.drawable.logo3, R.drawable.logo4,
    R.drawable.logo5, R.drawable.logo6, R.drawable.logo7, R.drawable.logo8, R.drawable.logo9, R.drawable.logo10};

}
