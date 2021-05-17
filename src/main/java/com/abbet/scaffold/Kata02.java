package com.abbet.scaffold;

import java.util.List;

/**
 * com.abbet.scaffold
 *
 * @author wangjun3
 * @version 1.0
 * @description
 * @create 2021/05/13 16:46.
 */

public class Kata02 {
    // 学到接口的重要性,对外接口改变会导致依赖的客户全要重写
    public int chop(int value, int[] values) {
        for (int i = 0; i < values.length; i++) {
            if(value == values[i]){
                return i;
            }
        }
        return -1;
    }
    public int chop(int value, List valuse){
        for (int i = 0; i < valuse.size(); i++) {
            if(value == (Integer) valuse.get(i)){
                return i;
            }
        }
        return -1;
    }
}
