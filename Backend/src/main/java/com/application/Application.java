package com.application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.application.endpoints.Endpoints;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
    }
    //@GetMapping("/hello")
    //public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    //  return String.format("Hello %s!", name);
    //}
}