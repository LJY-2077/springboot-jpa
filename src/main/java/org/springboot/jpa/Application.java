package org.springboot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/618:53
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);

    }
}
