package com.lh.study.single;

import java.io.Serializable;

/**
 * @ClassName Seriable
 * @Description
 * @Date 2018/12/8 12:55
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class Seriable implements Serializable {

    private Seriable(){

    }
    /**序列化指将内存中的对象数据转换为字节码，通过IO流写到文件中或者其他地方，这样对象的状态就永久保存下来了*/
    /**反序列化指将文件中的字节码通过IO流读取转换为java对象，在转换过程中会重新new一个对象，这样保证对象的状态不会丢失*/
    private final static Seriable SERIABLE = new Seriable();
    public static Seriable getInstance(){
        return SERIABLE;
    }

    public Object readResovle(){
        return SERIABLE;
    }
}
