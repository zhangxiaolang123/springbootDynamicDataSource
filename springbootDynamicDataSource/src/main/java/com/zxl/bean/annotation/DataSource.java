package com.zxl.bean.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @Description: 用以切换数据源的注解 Annotations to switch data sources
 * @Auther: zxl
 * @Date: 2018/5/26
 */
@Component
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface DataSource {
    String dataSource() default "";
}
