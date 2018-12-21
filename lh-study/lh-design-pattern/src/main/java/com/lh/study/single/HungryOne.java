package com.lh.study.single;

/**
 * @ClassName HungryOne
 * @Description
 * @Date 2018/12/8 11:49
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class HungryOne {

    private HungryOne(){

    }

    private  static  HungryOne hungryOne = new HungryOne();
    /*
    * @Author liang.hao
    * @Description 单例模式，饿汉式，容易照成内存浪费
    * @Date 11:50 2018/12/8
    * @Param []
    * @return com.lh.study.single.HungryOne
    **/
    public static HungryOne getInstance(){
        return hungryOne;
    }
}
