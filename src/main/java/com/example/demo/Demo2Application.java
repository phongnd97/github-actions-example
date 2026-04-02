package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo2Application {

    @GetMapping("/welcome")
    public String home() {
        return "Hello World!";
    }

//    echo "# github-actions-example" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/phongnd97/github-actions-example.git
//    git push -u origin main


    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

}
