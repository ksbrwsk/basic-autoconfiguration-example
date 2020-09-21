package de.ksbrwsk.numbers;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(NumberProperties.class)
public class NumberAutoConfiguration {

    @Bean
    public NumberService numberService(NumberProperties numberProperties) {
        return new NumberService(numberProperties);
    }
}
