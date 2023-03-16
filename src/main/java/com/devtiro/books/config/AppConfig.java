package com.devtiro.books.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.devtiro.books.BookInitializer;


@Configuration
public class AppConfig {
    
    private final BookInitializer bookInitializer;
    
    public AppConfig(BookInitializer bookInitializer) {
        this.bookInitializer = bookInitializer;
    }
    
    @Bean
    public CommandLineRunner init() {
        return args -> {
            bookInitializer.initialize();
        };
    }
}
