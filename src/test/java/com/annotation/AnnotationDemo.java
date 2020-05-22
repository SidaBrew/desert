package com.annotation;

import java.lang.annotation.*;

/***
 *  Created by shao.guangze on 2020/5/10
 */

@Documented
@Inherited
@Target({ElementType.FIELD , ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationDemo {

    public String value() default "";

}
