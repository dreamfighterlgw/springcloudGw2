package com.dreamfighter.lgw.server;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();//关闭csrf，因为默认下每次请求都要带token，但由于需要跨域请求，故需要关闭此。

        super.configure(http);

    }

}

