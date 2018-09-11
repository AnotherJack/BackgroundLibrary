package com.noober.background.utils;

import android.util.StateSet;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jack on 2018/9/11.
 */

public class ViewStateUtils {
    //取所有状态数组的并集
    public static Set<int[]> mergeStates(int[][]... statesArray) {
        Set<int[]> set = new HashSet<>();
        for (int[][] states : statesArray) {
            for (int[] state:states){
                if (!containStateInSet(set,state)){
                    set.add(state);
                }
            }
        }

        return set;
    }

    //判断set中是否包含某一state
    private static boolean containStateInSet(Set<int[]> set, int[] targetState){
        for (int[] state: set){
            if (StateSet.stateSetMatches(targetState,state)){
                return true;
            }
        }

        return false;
    }
}
