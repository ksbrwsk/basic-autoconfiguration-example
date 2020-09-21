package de.ksbrwsk.numbers;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ContextConfiguration(classes = {NumberAutoConfiguration.class})
@Slf4j
public class NumberServiceTest {

    @Autowired
    NumberProperties numberProperties;
    @Autowired
    NumberService numberService;

    @Test
    void generateRandomNumber() {
        int actualBoundry = this.numberProperties.getBound();
        log.info("Current Boundry: {}", actualBoundry);

        int nextInt = this.numberService.generateRandomNumber();

        assertTrue(nextInt <= actualBoundry);
        log.info("assertTrue(nextInt <= actualBoundry : {} <= {}", nextInt, actualBoundry);
    }
}