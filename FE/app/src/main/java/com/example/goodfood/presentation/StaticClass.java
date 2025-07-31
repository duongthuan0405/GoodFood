package com.example.goodfood.presentation;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class StaticClass
{
    public static final String DATE_TIME_FORMATTER = "dd/MM/yyyy";

    public static void setImage(ImageView imageView, Context context, String url, int defaultResource)
    {
        Glide.with(context)
                .load(url)
                .error(defaultResource)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(imageView);
    }
}
