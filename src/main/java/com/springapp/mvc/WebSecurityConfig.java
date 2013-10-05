package com.springapp.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: shekhargulati
 * Date: 06/10/13
 * Time: 12:20 AM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/home").permitAll().
                antMatchers("/").permitAll().
                anyRequest().authenticated().
                and().
                formLogin().defaultSuccessUrl("/hello").loginPage("/login").permitAll().
                and().
                logout();

    }

    @Override
    protected void registerAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.inMemoryAuthentication().withUser("user").password("password").roles("USERS");
    }
}
