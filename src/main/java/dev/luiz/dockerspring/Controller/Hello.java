package dev.luiz.dockerspring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello World";
    }
}
