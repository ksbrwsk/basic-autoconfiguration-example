package de.ksbrwsk.numbers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@ConfigurationProperties(prefix = "numbers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class NumberProperties {
    @Min(1)
    @Max(150)
    private Integer bound;
}
