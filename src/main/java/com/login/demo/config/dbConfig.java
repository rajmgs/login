package com.login.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
//import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@EnableAutoConfiguration
@PropertySource(value = { "classpath:application.properties" })
public class dbConfig {
	@Value(value = "${spring.datasource.driver-class-name}")
	String driverClass;
	@Value(value="${spring.datasource.url}")
	String url;
	@Value(value="${spring.datasource.username}")
	String dbname;
	@Value(value="${spring.datasource.password}")
	String dbpassword;
	@Bean(name="dataSource")
	public DataSource getDataSource(){
		DriverManagerDataSource dataSourceBuilder =new DriverManagerDataSource();
        dataSourceBuilder.setDriverClassName(driverClass);
        dataSourceBuilder.setUrl(url);
        dataSourceBuilder.setUsername(dbname);
        dataSourceBuilder.setPassword(dbpassword);
        System.out.println(dataSourceBuilder);
        return dataSourceBuilder;
		
	}
	@Bean(name="jdbcTemplateu")
	public JdbcTemplate jdbctemplate(DataSource dataSource) {
		JdbcTemplate jdbctemplate = new JdbcTemplate(dataSource);
		jdbctemplate.setResultsMapCaseInsensitive(true);
		return jdbctemplate;
	}
	@Bean(name="jdbcInsert")
	public SimpleJdbcInsert jdbcinserttemplate(DataSource dataSource) {
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource);
		return jdbcInsert;
	}

}
