package org.example.pract13;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.second_name}")
    private String secondName;
    @Value("${student.group}")
    private String group;

    @PostConstruct
    public void init() {
        System.out.println(name);
        System.out.println(secondName);
        System.out.println(group);
    }
}
