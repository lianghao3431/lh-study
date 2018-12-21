package com.lh.study.test;

import com.lh.study.prototype.CloneBean;

/**
 * @ClassName CloneTest
 * @Description
 * @Date 2018/12/8 13:34
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class CloneTest {

    public static void main(String[] args) {
        CloneBean cloneBean = new CloneBean();
        cloneBean.name = "tom";
        cloneBean.list.add("aaa");

        try {
            CloneBean c = (CloneBean)cloneBean.clone();
            System.out.println(c.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
