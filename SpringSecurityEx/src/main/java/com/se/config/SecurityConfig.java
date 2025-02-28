package com.se.config;

import java.net.Authenticator.RequestorType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//this tells spring that this is security user wants
@Configuration
//this tells spring that don't go for default configuration 
//go with this security mentioned here
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf(customizer -> customizer.disable())
				.authorizeHttpRequests(request -> request.anyRequest().authenticated())
				.formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults()).build();
	}

	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		provider.setUserDetailsService(userDetailsService);
		return provider;
	}

//		Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new Customizer<CsrfConfigurer<HttpSecurity>>() {
//
//			@Override
//			public void customize(CsrfConfigurer<HttpSecurity> customizer) {
//				customizer.disable();
//			}
//		};
//
//		http.csrf(custCsrf);
//		return http.build();

	// for hard code static user
//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails user1 = User
//				.withDefaultPasswordEncoder()
//				.username("java")
//				.password("j123")
//				.roles("user")
//				.build();
//		
//		UserDetails user2 = User
//				.withDefaultPasswordEncoder()
//				.username("spring")
//				.password("s123")
//				.roles("ADMIN")
//				.build();
//		return new InMemoryUserDetailsManager(user1,user2);
//	}

}
