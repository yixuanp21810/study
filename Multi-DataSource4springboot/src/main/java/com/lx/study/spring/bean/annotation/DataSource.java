package com.lx.study.spring.bean.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @Description: 用以切换数据源的注解 Annotations to switch data sources
 * @Auther: lixiao
 * @Date: 2018/2/23 16:44
 */
@Component
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface DataSource {
    String dataSource() default "";
}
