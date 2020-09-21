package de.ksbrwsk.numbers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ThreadLocalRandom;

@RequiredArgsConstructor
@Slf4j
public class NumberService {

    private final NumberProperties numberProperties;

    public int generateRandomNumber() {
        log.info("start generating a new Random Number.");
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        return threadLocalRandom.nextInt(this.numberProperties.getBound());
    }
}
