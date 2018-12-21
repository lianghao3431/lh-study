package com.lh.study.single;

/**
 * @ClassName LazyThree
 * @Description
 * @Date 2018/12/8 12:20
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class LazyThree {

    private boolean flag = false;


    private LazyThree() {
        synchronized (LazyThree.class) {
            if (!flag) {
                flag = true;
            } else {
                throw new RuntimeException("单例被入侵");
            }
        }
    }

    /*
     * @Author liang.hao
     * @Description
     * @Date 12:29 2018/12/8
     * @Param []
     * @return com.lh.study.single.LazyThree
     **/
    public static final LazyThree getInstance() {
        /**内部类默认不加载，当使用的时候才会加载，这样既避免了内存浪费，也避免了线程不安全*/
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyThree LAZY = new LazyThree();
    }
}
