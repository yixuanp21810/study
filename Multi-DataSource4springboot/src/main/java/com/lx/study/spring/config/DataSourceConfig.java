package com.lx.study.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.transaction.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 数据源配置,将自定义的所有的数据源传给数据源路由器
 *                 Data source configuration, which routes all custom data sources to the data source router
 * @Auther: lixiao
 * @Date: 2019/2/23 17:41
 */
@Configuration
public class DataSourceConfig {
    @Autowired
    private DBProperties dbProperties;

    /**
     * 配置数据源 Configure data sources
     * @return
     */
    @Bean(name = "dataSource")
    public DataSource dataSource() {
        //初始化自定义数据源集 Initializes the custom datasource set
        dbProperties.init();
        /**
         *  采用AbstractRoutingDataSource的对象包装多数据源
         *  Adopting AbstractRoutingDataSource object packing more data sources
         */
        DynamicDataSource dataSource = new DynamicDataSource();
        dataSource.setTargetDataSources(dbProperties.getDataSources());
        /**
         * 设置默认的数据源，当拿不到指定数据源或者未指定数据源时使用该配置
         * Sets the default data source and uses this configuration when the specified data source is not available or is not specified
         */
        dataSource.setDefaultTargetDataSource(dbProperties.getDefaultDataSource());
        return dataSource;
    }

    /**
     * 配置事务管理 Configuration transaction management
     * @return
     */
    @Bean
    public PlatformTransactionManager txManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
