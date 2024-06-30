package hieu.demo.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

}