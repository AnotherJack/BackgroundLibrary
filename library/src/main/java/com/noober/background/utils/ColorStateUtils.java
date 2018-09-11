package com.noober.background.utils;

import android.content.res.ColorStateList;

import java.lang.reflect.Field;

/**
 * Created by jack on 2018/9/11.
 */

public class ColorStateUtils {
    public static int[][] getStates(ColorStateList colorStateList){
        if (colorStateList == null) return new int[][]{};

        int[][] states;
        Field stateSpecsField;
        try {
            stateSpecsField = ColorStateList.class.getDeclaredField("mStateSpecs");
            stateSpecsField.setAccessible(true);
            states = (int[][]) stateSpecsField.get(colorStateList);
        } catch (Exception e) {
            e.printStackTrace();
            states = new int[][]{};
        }

        return states;
    }
}
