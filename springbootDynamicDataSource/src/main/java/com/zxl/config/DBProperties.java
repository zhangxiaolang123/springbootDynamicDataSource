package com.zxl.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 自定义数据源配置
 * @Auther: zxl
 * @Date: 2019/5/26
 */
@Data
@Component
@ConfigurationProperties(prefix = "druid")
//@ConfigurationProperties的大致作用就是通过它可以把properties或者yml配置直接转成对象(并获取properties的值)
//prefix = "druid"是properties里的前缀
public class DBProperties {
    //使用Druid数据源
    private DruidDataSource dataSource1;
    private DruidDataSource dataSource2;

    public Map<Object, Object> getDataSources() {
        return dataSources;
    }

    public void setDataSources(Map<Object, Object> dataSources) {
        this.dataSources = dataSources;
    }

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
