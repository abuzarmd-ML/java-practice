package com.example.demo.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final String firstName = "Mohammad";
    private final String lastName = "Abuzar";

    @GetMapping("/v1/student/name")
    public String getStudentName(@RequestParam(defaultValue = "false") boolean formal) {
        if (formal) {
            return firstName + " " + lastName;
        } else {
            return firstName;
        }
    }
}
