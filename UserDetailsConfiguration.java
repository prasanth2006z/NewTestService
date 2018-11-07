package com.goodies.authn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class UserDetailsConfiguration{

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		// Data source for Oauth
		auth.inMemoryAuthentication().withUser("bill").password("{noop}abc123").roles("USER")
				.and().withUser("myuser").password("{noop}mypassword").roles("USER")
				.and().withUser("test").password("{noop}testpassword").roles("USER");
	}
	
	//http://sivatechlab.com/secure-rest-api-using-spring-security-oauth2-part-4/

}
