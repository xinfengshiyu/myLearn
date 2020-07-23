package com.mylearn.biz.base;

/**
 * @author zisheng.nong
 * @create 2019-10-13 下午11:41
 * @desc
 **/
public class TestB extends TestA {

    public String run(TestB testB) {

        return ("B & B");
    }

    @Override
    public String run(TestA testA) {

        return ("B & A");
    }

}
