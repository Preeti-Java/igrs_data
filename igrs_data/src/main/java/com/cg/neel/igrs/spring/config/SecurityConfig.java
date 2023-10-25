/**
 * 
 */
package com.cg.neel.igrs.spring.config;

import java.util.Arrays;
import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

/**
 * @author Preeti Rani
 * @Level Important class
 * @Description All type of security
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	/**
	 * @return
	 */
	@Bean
	public PasswordEncoder enoder() {
		//Update in future
		return new BCryptPasswordEncoder(11);
	}
	
	
	 
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.securityContext((context) -> context
                .requireExplicitSave(false))
        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        .cors(corsCustomizer -> corsCustomizer.configurationSource(new CorsConfigurationSource() {
            @Override
            public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
                CorsConfiguration config = new CorsConfiguration();
                config.setAllowedOrigins(Arrays.asList("http://localhost:4200","http://localhost"));
                config.setAllowedMethods(Collections.singletonList("*"));
                config.setAllowCredentials(true);
                config.setAllowedHeaders(Collections.singletonList("*"));
                config.setMaxAge(3600L);
                return config;
            }
        }))
		 	.csrf().disable() 
          .csrf()
          .disable()
         // .sessionManagement()
        //  .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
         // .and()
		 .authorizeHttpRequests().anyRequest().permitAll()
         .and()
          .exceptionHandling().authenticationEntryPoint((request, response, authException) ->
                      response.sendError(HttpServletResponse.SC_UNAUTHORIZED));

      return http.build();
	}
	
	@Bean
	public AuthenticationManager authenticationManagerBean(HttpSecurity http) throws Exception {
		  return http.getSharedObject(AuthenticationManagerBuilder.class)
		            .build();
	}
	
	 @Bean
	    public ResourceBundleMessageSource messageSource() {
	        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
	        source.setBasename("messages");
	        source.setCacheSeconds(3600); // Refresh cache once per hour.
	        return source;
	    }
	 
}
