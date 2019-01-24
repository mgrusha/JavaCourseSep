package com.itcourses.grusha.Annotations;

import com.itcourses.grusha.Objects.Abstraction.AngryDog;
import com.itcourses.grusha.Objects.Abstraction.Animal;
import com.itcourses.grusha.Objects.Abstraction.Cat;
import com.itcourses.grusha.Objects.Abstraction.Dog;


public class AnnotationsTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog angryDog = new AngryDog();
        Cat cat = new Cat(true,"Fish",4);
        couldWeFeedIt(dog);
        couldWeFeedIt(angryDog);
        couldWeFeedIt(cat);

    }
      public static void couldWeFeedIt(Animal animal){
        if (animal.getClass().isAnnotationPresent(TestAnnotations.class)){
            TestAnnotations annotation = animal.getClass().getAnnotation(TestAnnotations.class);
            if (annotation.doublecheck())
              System.out.println(annotation.msg());
        }

      }
}
