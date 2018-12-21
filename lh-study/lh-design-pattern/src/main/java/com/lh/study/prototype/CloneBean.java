package com.lh.study.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CloneBean
 * @Description
 * @Date 2018/12/8 13:32
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class CloneBean implements  Cloneable{

    public String name;
    public List<String> list = new ArrayList<String>();
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
