package com.mylearn.biz.base;

/**
 * @author zisheng.nong
 * @create 2019-10-13 下午11:47
 * @desc
 **/
public class MyLearnBaseTest {

    public static void main(String[] args) {

        TestA testA = new TestA();
        TestA testAB = new TestB();

        TestB testB = new TestB();

        TestC testC = new TestC();
        TestD testD = new TestD();


        System.out.println(testA.run(testB));
        System.out.println(testA.run(testC));
        System.out.println(testA.run(testD));

        System.out.println(testAB.run(testB));
        System.out.println(testAB.run(testC));
        System.out.println(testAB.run(testD));

        System.out.println(testB.run(testB));
        System.out.println(testB.run(testC));
        System.out.println(testB.run(testD));
    }
}
