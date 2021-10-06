package br.com.sgl.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class SglUserApplication {

    @Value("${app.label}")
    private String teste;

    @RequestMapping("/")
    public String home(){
        return "Hello World "+teste;
    }

    public static void main(String[] args) {
        SpringApplication.run(SglUserApplication.class, args);

    }

}
