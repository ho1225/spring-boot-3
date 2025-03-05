package com.schh.boot.Config;

import com.alibaba.druid.FastsqlException;
import com.schh.boot.bean.Pig;
import com.schh.boot.bean.Sheep;
import com.schh.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

//@Import(FastsqlException.class)
@SpringBootConfiguration

@EnableConfigurationProperties(Sheep.class) //generally used for third party component because we can't annotate them with @Component, Springboot only default to scan the folder where the main class is located
//@Configuration
public class AppConfig {

    @Bean
    @ConfigurationProperties(prefix = "pig")
    public Pig pig(){
        return new Pig();
    }

    @Scope("prototype")
    @Bean("usertest")
    public User user01(){
        var user = new User();
        user.setId(1L);
        user.setName("Annie");
        return user;
    }

//    @Bean
//    public FastsqlException fastsqlException(){
//        return new FastsqlException();
//    }

}
