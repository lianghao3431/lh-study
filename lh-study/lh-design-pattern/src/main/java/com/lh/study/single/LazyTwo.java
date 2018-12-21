package com.lh.study.single;

/**
 * @ClassName LazyTwo
 * @Description
 * @Date 2018/12/8 12:18
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class LazyTwo {


    private LazyTwo() {
    }

    private static LazyTwo lazyTwo = null;

    /*
     * @Author liang.hao
     * @Description 单例模式，同步锁，线程安全，但是性能差
     * @Date 12:16 2018/12/8
     * @Param []
     * @return com.lh.study.single.LazyOne
     **/
    public synchronized static LazyTwo getInstance() {
        if (lazyTwo == null) {
            lazyTwo = new LazyTwo();
            return lazyTwo;
        }
        return lazyTwo;
    }
}
