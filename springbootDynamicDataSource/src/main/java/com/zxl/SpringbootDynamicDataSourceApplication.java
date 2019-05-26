package com.zxl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages= "com.zxl.mapper")
@MapperScan("com.zxl.mapper")
@ComponentScan({"com.zxl","com"})
public class SpringbootDynamicDataSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDynamicDataSourceApplication.class, args);
	}

}
