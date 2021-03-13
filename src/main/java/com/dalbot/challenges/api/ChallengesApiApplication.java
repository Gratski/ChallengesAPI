package com.dalbot.challenges.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.dalbot.challenges.api.dao.repository")
@EntityScan(basePackages = "com.dalbot.challenges.api.dao.model")
public class ChallengesApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(ChallengesApiApplication.class, args);
  }

}
