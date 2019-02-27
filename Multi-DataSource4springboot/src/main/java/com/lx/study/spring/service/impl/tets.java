package com.lx.study.spring.service.impl;

/**
 * @Description:
 * @Auther: lixiao
 * @Date: 2019/2/26 20:51
 */
public class tets {
    private static final ThreadLocal threadLocal = new ThreadLocal();
    private static final ThreadLocal threadLoca2 = new ThreadLocal();
    public static void main(String[] args){
        threadLocal.set("lixiao");
       // threadLoca2.set("lixiao111");
        threadLoca2.remove();
        System.out.println(threadLocal.get());
        System.out.println(threadLoca2.get());
    }
}
