package com.itcourses.grusha.Spring;

import com.itcourses.grusha.Objects.Inheritance.Animal;
import com.itcourses.grusha.Objects.Interfaces.Speakable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExample {

    static SpringExample example;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Animal animal = context.getBean("selectedAnimal", Animal.class);
        System.out.println(animal.getNoOfLegs());
        Animal animal2 = context.getBean("selectedAnimal", Animal.class);
        System.out.println(animal.equals(animal2));


      context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Speakable speakable = context.getBean(Speakable.class);
        System.out.println(speakable.speak());
         animal2 = context.getBean(Animal.class);
        System.out.println(animal2.getNoOfLegs());

    }

    public static SpringExample lazyInitializer(){
        if (example==null){
            example = new SpringExample();
        }
        return example;
    }
}
