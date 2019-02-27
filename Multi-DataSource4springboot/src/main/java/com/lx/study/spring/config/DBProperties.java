package com.lx.study.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 自定义数据源配置
 * @Auther: lixiao
 * @Date: 2019/2/23 14:38
 */
@Data
@Component
@ConfigurationProperties(prefix = "druid")
public class DBProperties {
    //Hikari 数据源
    //private HikariDataSource test1;
    //private HikariDataSource test2;

    //使用Druid数据源
    private DruidDataSource dataSource1;
    private DruidDataSource dataSource2;
    private Map<Object, Object> dataSources = new HashMap<>();
    private String defaultName;

    /**
     * 初始化自定义数据源集 Initializes the custom datasource set
     */
    public void init(){
        dataSources.put("dataSource1",dataSource1);
        dataSources.put("dataSource2",dataSource2);
    }

    /**
     * 获得默认的数据源 Get the default data source
     * @return
     */
    public DruidDataSource getDefaultDataSource(){
        return (DruidDataSource)this.dataSources.get(defaultName);
    }
}
