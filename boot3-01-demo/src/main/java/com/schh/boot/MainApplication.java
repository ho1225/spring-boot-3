package com.schh.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author schh
 * @Despcription start spring boot main application
 * @create 2025/2/12
 */

@SpringBootApplication(scanBasePackages = "com.schh")
public class MainApplication {

        public static void main(String[] args) {

            //java10
            var ioc = SpringApplication.run(MainApplication.class, args);

            String[] names = ioc.getBeanDefinitionNames();

            for (String name : names) {
                System.out.println(name);
            }
        }
}
