package com.abbet.scaffold;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
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
            if (value == values[i]) {
                return i;
            }
        }
        return -1;
    }

    public int chop(int value, List values) {
        if (values.isEmpty()) {
            return -1;
        }
        int low = 0;
        int high = values.size() - 1;
        return bitSearch(low, high, value, values);
    }

    private int bitSearch(int low, int high, int value, List values) {
        int middle = (low + high) / 2;
        if (low > high) {
            return -1;
        }
        if (low == high && value != (Integer) values.get(low)) {
            return -1;
        }
        if(value > (Integer)values.get(middle)){
            return bitSearch(middle+1,high,value,values);
        }
        if(value < (Integer)values.get(middle)){
            return bitSearch(low,middle-1,value,values);
        }
        return middle;
    }
}
