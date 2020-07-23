package com.mylearn.biz;

import com.alibaba.fastjson.JSONObject;
import com.my.learn.biz.base.PairObject;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author zisheng.nong
 * @create 2020-04-17 上午11:44
 * @desc
 **/
public class Lamba8Test {

    public static void main(String[] args) {

        List<PairObject> dataList = new ArrayList<>();

        PairObject pairObject = new PairObject();
        pairObject.setId(1L);
        pairObject.setName("test1");

        PairObject pairObject2 = new PairObject();
        pairObject2.setId(2L);
        pairObject2.setName("test2");

        PairObject pairObject3 = new PairObject();
        pairObject3.setId(1L);
        pairObject3.setName("test3");

        dataList.add(pairObject);
        dataList.add(pairObject2);
        dataList.add(pairObject3);

        System.out.println("dataList:" + JSONObject.toJSONString(dataList));

        Map<Long, String> map = dataList.stream().collect(Collectors.toMap(PairObject::getId, PairObject::getName,
                                                                           (oldValue, newValue) -> newValue));

        Map<String, PairObject> nameMap = dataList.stream().collect(Collectors.toMap(PairObject::getName, Function.identity(),
                                                                               (oldValue, newValue) -> newValue));


        /** 注意 java8中 的lambada表达式，list中有空对象时，会报空指针异常 */
        /** 注意 java8中 的lambada表达式，list中有重复的对象时，转换map会有 Duplicate key 异常 */

        for (Map.Entry entryItem : map.entrySet()) {
            System.out.println("key:" + entryItem.getKey() + ",value:" + entryItem.getValue());
        }

        for (Map.Entry entryItem : nameMap.entrySet()) {
            System.out.println("NameKey:" + entryItem.getKey() + ",value:" + entryItem.getValue());
        }

        for(Map.Entry entryItem : map.entrySet()){
            System.out.println("reResultKey:" + entryItem.getKey() + ",value:" + nameMap.get(entryItem.getValue()));
        }



        Iterable<List<PairObject>> partitionResult = Iterables.partition(dataList, 3);



    }
}
