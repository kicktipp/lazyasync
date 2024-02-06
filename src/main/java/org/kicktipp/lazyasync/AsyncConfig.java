package org.kicktipp.lazyasync;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableAsync;

//
// @Lazy(value = false)
@Configuration
// test run
@EnableAsync(mode = AdviceMode.ASPECTJ)
public class AsyncConfig {
}
