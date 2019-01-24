package com.itcourses.grusha.Annotations;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented // Tell javadoc to include usage of our custom annotations
public @interface TestAnnotations {

        // The "role" played in the design pattern. (value is optional)
        boolean doublecheck() default false;

        // Some text to be displayed played in the design pattern. (optional)
        String msg() default "";
   }


