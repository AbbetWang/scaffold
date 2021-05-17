package com.abbet.scaffold;

import org.assertj.core.internal.Numbers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

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
    @ParameterizedTest
    @MethodSource("dataProvider")
    void when_container_return_index(int value, int index, List<Integer> input){
        Kata02 kata02 = new Kata02();
        int actual = kata02.chop(value,input );
        Assert.isTrue(actual == index, "没有查找到指定元素");
    }
    static Stream<Arguments> dataProvider(){
        return Stream.of(
                arguments(3,3,Arrays.asList(0,1,2,3)),
                arguments(5,3,Arrays.asList(0,1,2,5))
        );
    }
}