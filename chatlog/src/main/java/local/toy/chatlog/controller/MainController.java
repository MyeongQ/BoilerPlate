package local.toy.chatlog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {
    @GetMapping("/")
    public String mainController() {
        log.info("main controller");
        return "Hello World!";
    }
}
