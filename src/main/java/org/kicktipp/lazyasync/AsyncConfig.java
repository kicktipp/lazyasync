package org.kicktipp.lazyasync;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableAsync;

// This does not help to run the test with AdviceMode.ASPECTJ
// @Lazy(value = false)
@Configuration
// Test runs fine with AdviceMode.PROXY
@EnableAsync(mode = AdviceMode.ASPECTJ)
//@EnableAsync(mode = AdviceMode.PROXY)
public class AsyncConfig {
}
