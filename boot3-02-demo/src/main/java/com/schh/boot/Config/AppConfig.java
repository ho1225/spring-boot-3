package com.schh.boot.Config;

import com.schh.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("usertest")
    public User user01(){
        var user = new User();
        user.setId(1L);
        user.setName("Annie");
        return user;
    }



}
