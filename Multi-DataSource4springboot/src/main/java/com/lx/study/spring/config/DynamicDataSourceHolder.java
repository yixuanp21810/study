package com.lx.study.spring.config;

/**
 * @Description: 动态数据源持有者，负责利用ThreadLocal存取本线程使用的数据源的名称
 * @Auther: lixiao
 * @Date: 2019/2/22 19:30
 */
public class DynamicDataSourceHolder {
    /**
     * 本地线程共享对象
     */
    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static void putDataSource(String name) {
        THREAD_LOCAL.set(name);
    }

    public static String getDataSource() {
        return THREAD_LOCAL.get();
    }

    /**
     * 清除本线程指定的数据源使用默认数据源
     */
    public static void clear() {
        THREAD_LOCAL.remove();
    }
}
