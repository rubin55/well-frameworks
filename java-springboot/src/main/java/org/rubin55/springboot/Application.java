package org.rubin55.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner clr(HumanRepository repository) {
        return args -> {

            // save a couple of customers
			repository.save(new Human("rubin", "Rubin Simons"));
			repository.save(new Human("freek", "Freek Alleman"));
			repository.save(new Human("stephan", "Stephan Kaffa"));
			repository.save(new Human("jasper", "Jasper Spoel"));

        };
    }

}
