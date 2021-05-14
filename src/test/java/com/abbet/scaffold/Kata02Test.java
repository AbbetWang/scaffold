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
    void should_return_negative_when_empty_array() {
        Kata02 kata02 = new Kata02();
        int index = kata02.chop(3, new int[0]);
        Assert.isTrue(-1 == index, "空数组不包含任何元素");
    }

    @Test
    void should_return_negative_when_not_contain() {
        Kata02 kata02 = new Kata02();
        int index = kata02.chop(3, new int[]{1});
        Assert.isTrue(-1 == index, "没有查到改任何元素");
    }

    @Test
    void should_return_positive_when_contain() {
        Kata02 kata02 = new Kata02();
        int index = kata02.chop(1, new int[]{1});
        Assert.isTrue(0 == index, "没有查找到指定元素");
    }
//    todo: 改造成多个测试用例输入
}