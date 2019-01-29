package com.itcourses.grusha.Spring;

import com.itcourses.grusha.Objects.Inheritance.Animal;
import com.itcourses.grusha.Objects.Interfaces.Speakable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Animal animal = context.getBean("selectedAnimal", Animal.class);
        System.out.println(animal.getNoOfLegs());
        //animal.setNoOfLegs(10);

      /*  context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Speakable speakable = context.getBean(Speakable.class);
        System.out.println(speakable.speak());*/
    }
}
