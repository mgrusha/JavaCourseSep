package com.itcourses.grusha.Spring;

import com.itcourses.grusha.Objects.Interfaces.Animal;
import com.itcourses.grusha.Objects.Interfaces.Cat;
import com.itcourses.grusha.Objects.Interfaces.Robot;
import com.itcourses.grusha.Objects.Interfaces.Speakable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean
    public Speakable speakable(){
        return new Robot();
    }

    @Bean
    @Lazy
    public Animal animal(){
        return new Cat(true,"Milk",4);
    }
}
