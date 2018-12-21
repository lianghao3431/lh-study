package com.lh.study.single;

/**
 * @ClassName LazyOne
 * @Description
 * @Date 2018/12/8 11:47
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class LazyOne {

    private LazyOne(){

    }

    private static LazyOne lazyOne = null;

    /*
    * @Author liang.hao
    * @Description 单例模式，线程不安全
    * @Date 11:50 2018/12/8
    * @Param
    * @return
    **/
    public static LazyOne getInstance(){
        if(lazyOne == null){
            lazyOne = new LazyOne();
            return lazyOne;
        }
        return lazyOne;
    }


}
