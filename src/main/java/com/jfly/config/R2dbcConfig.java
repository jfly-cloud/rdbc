package com.jfly.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
@EnableR2dbcRepositories
public class R2dbcConfig {

    @Autowired
    private DatabaseClient databaseClient;

    @Bean
    public R2dbcEntityTemplate r2dbcEntityTemplate(){
        return  new R2dbcEntityTemplate(databaseClient);
    }

}
