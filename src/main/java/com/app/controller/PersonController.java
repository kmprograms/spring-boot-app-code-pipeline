package com.app.controller;

import com.app.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {
    @GetMapping
    public List<Person> getAll() {
        return Arrays.asList(
                Person.builder().name("A").age(11).build(),
                Person.builder().name("B").age(12).build(),
                Person.builder().name("C").age(13).build() );
    }

    @GetMapping("/one")
    public Person getOne() {
        return Person.builder().name("A").age(11).build();
    }
}
