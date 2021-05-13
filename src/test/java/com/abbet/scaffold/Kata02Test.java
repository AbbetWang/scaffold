package com.abbet.scaffold;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

/**
 * com.abbet.scaffold
 *
 * @author wangjun3
 * @version 1.0
 * @description
 * @create 2021/05/13 16:46.
 */
@SpringBootTest
class Kata02Test {
    @Test
    void should_return_negative(){
        Kata02 kata02 = new Kata02();
        int index = kata02.chop(3, new int[0]);
        Assert.isTrue(-1 == index,"空数组不包含任何元素");
    }
}