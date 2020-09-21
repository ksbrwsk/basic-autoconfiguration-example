package de.ksbrwsk.numbers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class NumberClient {

    private final NumberService numberService;

    @EventListener(ApplicationReadyEvent.class)
    public void generate() {
        int i = this.numberService.generateRandomNumber();
        log.info("new Random Number generated: {}", i);
    }
}
