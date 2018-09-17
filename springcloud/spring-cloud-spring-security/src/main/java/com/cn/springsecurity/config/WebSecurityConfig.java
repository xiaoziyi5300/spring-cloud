package com.cn.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * @Auther: lzf
 * @Date: 2018/9/14 0014 11:33
 * @Description:
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String[] exclusivePaths = {"/login_page", "/login", "/", "/success", "/error_page"};

    @Autowired
    private AuthenticationSuccessHandler myAuthenticationSuccessHandler;
    @Autowired
    private AuthenticationFailureHandler myAuthenticationFailHander;


    @Autowired
    private CustAuthenticationProvider custAuthenticationProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(exclusivePaths).permitAll()// 任何用户可以访问
                .anyRequest().authenticated()
                .and()
                .csrf().disable()//默认开启，这里先显式关闭
                .formLogin()
                .loginPage("/login_page")
                .loginProcessingUrl("/login")
                //.successForwardUrl("/success")  //登录成功跳转地址
                //.failureForwardUrl("/error_page"); //登录失败跳转地址
                .successHandler(myAuthenticationSuccessHandler)
                .failureHandler(myAuthenticationFailHander);
        super.configure(http);
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //auth.inMemoryAuthentication().withUser("user").password("123456").roles("USER");
        //auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");
        auth.authenticationProvider(custAuthenticationProvider);
    }
}
