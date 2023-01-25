package com.example.javaprothreadingnotes.stream;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DataTool {

    /**
     * list 转 map 集合
     * @param source 数据源集合
     * @param keyMapper map 集合中的 key 获取规则
     * @param valueMapper map 集合中的 value 获取规则
     * @param <K> map 集合中的 key 类型
     * @param <S> 数据源集合中元素的类型
     * @param <T> map 集合中的 value 类型
     * @return
     */
    public static <K,S,T>Map<K,T> toMap(List<S> source, Function<? super S, ? extends K> keyMapper, Function<? super S, ? extends T> valueMapper) {
        if (null == source || source.size() == 0) {
            return Collections.emptyMap();
        }
        return source.stream().collect(Collectors.toMap(keyMapper,valueMapper));
    }
}
