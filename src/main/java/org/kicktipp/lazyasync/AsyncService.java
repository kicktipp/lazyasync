package org.kicktipp.lazyasync;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public void greeting()  {
        try {
            Thread.sleep(3000);
            System.out.println("Hallo");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
