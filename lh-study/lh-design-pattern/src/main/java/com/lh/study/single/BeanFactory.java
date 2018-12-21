package com.lh.study.single;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName BeanFactory
 * @Description
 * @Date 2018/12/8 12:35
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class BeanFactory {

    private static Map<String , Object> beanMap = new ConcurrentHashMap<String , Object>();

    public static Object getBean(String name){
        if(beanMap.containsKey(name)){
            return beanMap.get(name);
        }else{
            Object obj = null;
            try {
                obj = Class.forName(name).newInstance();
                beanMap.put(name , obj);
                return obj;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return obj;
        }

    }
}
