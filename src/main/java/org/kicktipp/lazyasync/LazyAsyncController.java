package org.kicktipp.lazyasync;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LazyAsyncController {
    private final AsyncService asyncService;

    public LazyAsyncController(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @ResponseBody
    @RequestMapping("/")
    public String get() {
        asyncService.greeting();
        return "Hello";
    }
}
