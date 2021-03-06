package com.myMVC.controller.annotate.connect_mybatis;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SqlSessions {
    String value()default "";
}
