package org.rubin55.springboot;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {


    HumanRepository repository;

    public HumanController(HumanRepository repository) {
        this.repository = repository;
    }


    @GetMapping(value="/", produces="application/json")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/humans")
    public String helloAll() {

        final Set<String> msgs = new HashSet<>();

        for (Human human : repository.findAll()) {
            msgs.add("Greetings " + human.getFullName());
        }

        return Arrays.toString(msgs.toArray());
    }


    @GetMapping("/humans/{alias}")
    public String helloHuman(@PathVariable String alias) {

        final Set<String> msgs = new HashSet<>();

        repository.findByAlias(alias).ifPresent(human -> {
            msgs.add("Greetings " + human.getFullName());
        });

        return Arrays.toString(msgs.toArray());
    }

}
