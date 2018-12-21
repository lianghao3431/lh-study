package com.lh.study.test;

import com.lh.study.single.LazyOne;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName TestLazyOne
 * @Description
 * @Date 2018/12/8 11:53
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class TestLazyOne {


    public static void main(String[] args) {
        int count = 1000;
        final CountDownLatch countDownLatch = new CountDownLatch(count);
        for(int i = 0 ; i<count;i++) {
            new Thread() {
                public void run() {
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    LazyOne lazyOne = LazyOne.getInstance();
                    System.out.println(lazyOne);
                }
            }.start();
            countDownLatch.countDown();
        }
    }
}
