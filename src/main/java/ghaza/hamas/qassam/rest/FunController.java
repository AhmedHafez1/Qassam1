package ghaza.hamas.qassam.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class FunController {
    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/fun")
    public String fun() {
        return "Fun!";
    }

    @GetMapping("/test")
    public String newFun() {
        return "dev!";
    }
}
