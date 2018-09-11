package com.noober.background.utils;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;

import static android.graphics.drawable.GradientDrawable.LINEAR_GRADIENT;

/**
 * Created by jack on 2018/9/11.
 */

public class GradientDrawableGenerator {
    private int shape = GradientDrawable.RECTANGLE;
    private int solidColor = Color.TRANSPARENT;
    private float[] cornerRadius = new float[]{0,0,0,0,0,0,0,0};
    private float sizeWidth = 0;
    private float sizeHeight = 0;
    private float strokeWidth = -1;
    private float strokeDashWidth = 0;
    private int strokeColor = 1;
    private float strokeGap = 0;
    private float centerX = 0;
    private float centerY = 0;
    private int centerColor = 0;
    private int startColor = 0;
    private int endColor = 0;
    private int gradientType = LINEAR_GRADIENT;
    private int gradientAngle = 0;
    private Rect padding = new Rect();

    public GradientDrawable generate(){
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(shape);

        return drawable;
    }

}
