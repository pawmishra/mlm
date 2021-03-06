package com.javerian.erp.mlm.configuration;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.javerian.erp.mlm.converter.RoleToUserProfileConverter;

@Configuration
@EnableWebMvc
// @PropertySource(value = { "classpath:jdbc.properties" })
@ComponentScan(basePackages = "com.javerian.erp.mlm")
public class AppConfig extends WebMvcConfigurerAdapter {

	@Autowired
	RoleToUserProfileConverter roleToUserProfileConverter;

	@Autowired
	private Environment env;

	/*
	 * @Bean public DataSource jdbcDataSource() { DriverManagerDataSource dataSource
	 * = new DriverManagerDataSource();
	 * dataSource.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName")
	 * ); dataSource.setUrl(env.getRequiredProperty("jdbc.url"));
	 * dataSource.setUsername(env.getRequiredProperty("jdbc.username"));
	 * dataSource.setPassword(env.getRequiredProperty("jdbc.password")); return
	 * dataSource; }
	 */

	/*
	 * @Bean public JdbcTemplate jdbcTemplate(DataSource jdbcDataSource) {
	 * JdbcTemplate jdbcTemplate = new JdbcTemplate(jdbcDataSource);
	 * jdbcTemplate.setResultsMapCaseInsensitive(true); return jdbcTemplate; }
	 */

	/**
	 * Configure ViewResolvers to deliver preferred views.
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		registry.viewResolver(viewResolver);
	}

	/**
	 * Configure ResourceHandlers to serve static resources like CSS/ Javascript
	 * etc...
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}

	/**
	 * Configure Converter to be used. In our example, we need a converter to
	 * convert string values[Roles] to UserProfiles in newUser.jsp
	 */
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(roleToUserProfileConverter);
	}

	/**
	 * Configure MessageSource to lookup any validation/error message in
	 * internationalized property files
	 */
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}

	/**
	 * Optional. It's only required when handling '.' in @PathVariables which
	 * otherwise ignore everything after last '.' in @PathVaidables argument. It's a
	 * known bug in Spring [https://jira.spring.io/browse/SPR-6164], still present
	 * in Spring 4.1.7. This is a workaround for this issue.
	 */
	@Override
	public void configurePathMatch(PathMatchConfigurer matcher) {
		matcher.setUseRegisteredSuffixPatternMatch(true);
	}

	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver getResolver() throws IOException {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();

		// Set the maximum allowed size (in bytes) for each individual file.
		resolver.setMaxUploadSizePerFile(5242880);// 5MB

		// You may also set other available properties.

		return resolver;
	}

	@Bean
	public CommonsMultipartResolver filterMultipartResolver() {
		return new CommonsMultipartResolver();
	}
}
