package com.sow;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("test.properties")
public class SportConfiguration {

    @Bean
    public FortuneService fortuneService(){
        return new BadLuckFortuneService();
    }

    @Bean
    public Coach tennisCoach(){
        return new TennisCoach();
    }
}
