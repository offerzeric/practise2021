package com.eric.project.annotation;



import java.lang.annotation.*;

/**
 * description
 *
 * @author ericzhang 2021/11/13 5:12 下午
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Conditional(AppleCondition.class)
public @interface ConditionOnJedis {
    String[] values();
}
