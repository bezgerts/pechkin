package me.bezgerts.pechkin.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("user").password("user").roles("USER").build());
        manager.createUser(User.withUsername("admin").password("admin").roles("ADMIN").build());
        return manager;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/",
                             "/login**",
                             "/webjars/**",
                             "/resources/**",
                             "/css/**",
                             "/js/**",
                             "/about")
                .permitAll()
                .antMatchers("/admin/**").hasAnyRole("ADMIN")
                .anyRequest()
                .authenticated()
                .and()
                    .logout().logoutSuccessUrl("/").permitAll();
    }
}

