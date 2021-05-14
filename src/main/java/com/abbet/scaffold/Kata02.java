package com.abbet.scaffold;

/**
 * com.abbet.scaffold
 *
 * @author wangjun3
 * @version 1.0
 * @description
 * @create 2021/05/13 16:46.
 */

public class Kata02 {
    public int chop(int value, int[] values) {
        for (int i = 0; i < values.length; i++) {
            if(value == values[i]){
                return i;
            }
        }
        return -1;
    }
}
