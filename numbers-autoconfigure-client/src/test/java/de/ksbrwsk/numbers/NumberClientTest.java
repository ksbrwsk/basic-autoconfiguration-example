package de.ksbrwsk.numbers;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class NumberClientTest {

    @Autowired
    NumberProperties numberProperties;

    @Autowired
    NumberService numberService;

    @Test
    void thatBoundryIsChecked() {
        int actualBoundry = this.numberProperties.getBound();
        log.info("Current Boundry: {}", actualBoundry);
        int random = this.numberService.generateRandomNumber();

        assertTrue(random <= actualBoundry);
        log.info("assertTrue(random <= actualBoundry): {} <= {}", random, actualBoundry);
    }
}