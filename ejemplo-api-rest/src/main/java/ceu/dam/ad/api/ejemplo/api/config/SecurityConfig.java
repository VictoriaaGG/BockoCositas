package ceu.dam.ad.api.ejemplo.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import ceu.dam.ad.api.ejemplo.api.filters.ApiKeyFilter;

@Configuration
public class SecurityConfig {

	@Autowired
	private ApiKeyFilter apiKeyFilter;

	@Bean
	SecurityFilterChain getSecurityFilterChain(HttpSecurity http) throws Exception {
		http.addFilterBefore(apiKeyFilter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
	}
}
