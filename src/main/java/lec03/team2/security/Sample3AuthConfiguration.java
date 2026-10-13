package lec03.team2.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class Sample3AuthConfiguration {

  @Bean
  public UserDetailsService userDetailsService() {

    UserDetails user1 = User.withUsername("user1")
        .password("{bcrypt}$2y$05$kZlnBR7s8AstDv44hkYlHuG.IOTpCfNJ4qU3woEkTjLsxKNMe4tMy")
        .roles("USER")
        .build();

    UserDetails user2 = User.withUsername("user2")
        .password("{bcrypt}$2y$05$.iLU1QemD5zHktJmdxZACOZwcZq7TH6GBBXZzK2hBmrYSfFMbgWfO")
        .roles("ADMIN")
        .build();

    return new InMemoryUserDetailsManager(user1, user2);
  }
}
