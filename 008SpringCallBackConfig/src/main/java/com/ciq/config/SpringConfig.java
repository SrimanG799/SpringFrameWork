package com.ciq.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = "com.ciq")
@PropertySource(value = { "classpath:db.properties" })
public class SpringConfig {

	@Autowired
	Environment env;

	@Bean
	public DataSource dataSource() {

		BasicDataSource basicdataSource = new BasicDataSource();
		basicdataSource.setUrl(env.getProperty("mysql.url"));
		basicdataSource.setDriverClassName(env.getProperty("mysql.driver"));
		basicdataSource.setUsername(env.getProperty("mysql.uname"));
		basicdataSource.setPassword(env.getProperty("mysql.pwd"));

		return basicdataSource;

	}

	@Bean
	public JdbcTemplate jdbcTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;

	}

}
