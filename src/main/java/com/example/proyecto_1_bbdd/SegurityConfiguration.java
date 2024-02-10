package com.example.proyecto_1_bbdd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SegurityConfiguration {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails john = User.builder().
                username("Carlos").
                password("{noop}test123").
                roles("STUDENT").build();
        UserDetails mary = User.builder().
                username("Raul").
                password("{noop}test123").
                roles("PROFESSOR").build();
        UserDetails susan = User.builder().
                username("Pedro").
                password("{noop}test123").
                roles("PROFESOR", "ADMIN" ).build();
        return new InMemoryUserDetailsManager(john, mary, susan);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configuer ->
                        configuer.anyRequest().authenticated())
                .formLogin(form ->
                        form.loginPage("/showMyLoginPage")
                                .loginProcessingUrl("/authenticateTheUser")
                                .permitAll()).
                logout(logout -> logout.permitAll()).
                exceptionHandling(configurer -> configurer.accessDeniedPage("/access-denied"));
        return http.build();
    }
}
