package com.login.demo.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class dbConfig {
	@Bean
	public DataSource getDataSource(){
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/login_example");
        dataSourceBuilder.username("loguser");
        dataSourceBuilder.password("myuser");
        System.out.println(dataSourceBuilder.build());
        return dataSourceBuilder.build();
		
	}

}
