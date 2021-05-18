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
    @ParameterizedTest
    @MethodSource("dataProvider")
    void when_container_return_index(int value, int index, List<Integer> input){
        Kata02 kata02 = n
        ew Kata02();
        int actual = kata02.chop(value,input );
        assertEquals(index,actual,"应该返回指定的index");
    }
    static Stream<Arguments> dataProvider(){
        return Stream.of(
                arguments(3,3,Arrays.asList(0,1,2,3)),
                arguments(5,3,Arrays.asList(0,1,2,5)),
                arguments(1,0,Arrays.asList(1)),
                arguments(1,0,Arrays.asList(1,3,5)),
                arguments(3,1,Arrays.asList(1,3,5)),
                arguments(5,2,Arrays.asList(1,3,5)),
                arguments(0,-1,Arrays.asList(1,3,5)),
                arguments(2,-1,Arrays.asList(1,3,5)),
                arguments(4,-1,Arrays.asList(1,3,5)),
                arguments(6,-1,Arrays.asList(1,3,5)),
                arguments(1,0,Arrays.asList(1,3,5,7)),
                arguments(3,1,Arrays.asList(1,3,5,7)),
                arguments(5,2,Arrays.asList(1,3,5,7)),
                arguments(7,3,Arrays.asList(1,3,5,7)),
                arguments(0,-1,Arrays.asList(1,3,5,7)),
                arguments(2,-1,Arrays.asList(1,3,5,7)),
                arguments(4,-1,Arrays.asList(1,3,5,7)),
                arguments(6,-1,Arrays.asList(1,3,5,7)),
                arguments(8,-1,Arrays.asList(1,3,5,7))
        );
    }
}