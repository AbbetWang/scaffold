package com.abbet.scaffold;

import org.springframework.beans.factory.annotation.Autowired;

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
    @Deprecated
    public int chop(int value, int[] values) {
        for (int i = 0; i < values.length; i++) {
            if(value == values[i]){
                return i;
            }
        }
        return -1;
    }
    public int chop(int value, List values){
        for (int i = 0; i < values.size(); i++) {
            if(value == (Integer) values.get(i)){
                return i;
            }
        }
        return -1;
    }
}
