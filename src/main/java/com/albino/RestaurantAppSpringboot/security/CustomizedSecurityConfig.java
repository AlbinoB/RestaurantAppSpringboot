package com.albino.restaurantappspringboot.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class CustomizedSecurityConfig {
    
    
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
         http.authorizeHttpRequests(
            config -> config
                .requestMatchers(HttpMethod.DELETE,"/customers").hasRole("ADMIN")
                .requestMatchers(HttpMethod.GET,"/customers").hasAnyRole("ADMIN", "USER")
                .requestMatchers(HttpMethod.POST,"/customers").hasAnyRole("ADMIN","USER")
         );

         http.httpBasic(Customizer.withDefaults());

        
         return http.build();
    }


    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {

        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

        jdbcUserDetailsManager.setUsersByUsernameQuery("select username, password, enabled from users where username = ?");

        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery("select username,authority from  authorities where username = ?");

        return jdbcUserDetailsManager;

    }


    /*
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails admin = User.builder()
                .username("admin")
                .password("{noop}ADMINpaSSWord@123")
                .roles("ADMIN")
                .build();


        UserDetails user = User.builder()
                .username("user")
                .password("{noop}USERpaSSWord@123")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin,user);
    }

    */
    

}
