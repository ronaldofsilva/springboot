package br.ueg.posse.si.p4.reflection.fw.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder
			.inMemoryAuthentication()
			.withUser("joao").password("123").roles("USER")
			.and()
			.withUser("alexandre").password("123").roles("USER")
			.and()
			.withUser("thiago").password("123").roles("USER");
	}
}