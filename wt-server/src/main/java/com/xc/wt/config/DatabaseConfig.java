package com.xc.wt.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;

@Configuration
public class DatabaseConfig {

	// @Bean
	// public LoadTimeWeaver getWeaver() {
	// return new DefaultContextLoadTimeWeaver();
	// }

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		final LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		final EclipseLinkJpaVendorAdapter vendorAdapter = new EclipseLinkJpaVendorAdapter();
		vendorAdapter.setGenerateDdl(true);
		vendorAdapter.setShowSql(false);
		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setDataSource(testDataSource());
		factory.setJpaProperties(jpaProperties());
		return factory;
	}

	@Bean
	public DataSource testDataSource() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost/task");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres");
		return dataSource;
	}

	@Bean
	public Properties jpaProperties() {
		final Properties properties = new Properties();
		properties.setProperty("eclipselink.weaving", "false");
		properties.setProperty("exclude-unlisted-classes", "false");
		return properties;
	}
}
