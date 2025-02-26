package com.schh.boot.Config;

import com.alibaba.druid.FastsqlException;
import com.schh.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Import(FastsqlException.class)
@SpringBootConfiguration
//@Configuration
public class AppConfig {

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
