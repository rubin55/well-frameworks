package org.rubin55.springboot;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    HumanRepository repository;

    public HelloController(HumanRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/hello")
    public String helloAll() {

        final Set<String> msgs = new HashSet<>();

        for (Human human : repository.findAll()) {
            msgs.add("Greetings " + human.getFullName());
        }

        return Arrays.toString(msgs.toArray());
    }


    @GetMapping("/hello/{alias}")
    public String helloHuman(@PathVariable String alias) {

        final Set<String> msgs = new HashSet<>();

        repository.findByAlias(alias).ifPresent(human -> {
            msgs.add("Greetings " + human.getFullName());
        });

        return Arrays.toString(msgs.toArray());
    }

}
