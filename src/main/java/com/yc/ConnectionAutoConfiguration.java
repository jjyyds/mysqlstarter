package com.yc;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ConnectionProperties.class)
@ConditionalOnClass(IDBHelper.class)
public class ConnectionAutoConfiguration {
    @Bean
    public IDBHelper idbHelper(){
        return new DBHelper();
    }
}
