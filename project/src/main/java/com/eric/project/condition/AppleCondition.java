package com.eric.project.condition;


import com.eric.project.annotation.ConditionOnJedis;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * description
 *
 * @author ericzhang 2021/11/13 4:39 下午
 */
public class AppleCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> conditionOnJedis = metadata.getAnnotationAttributes(ConditionOnJedis.class.getName());
        String[] values = (String[]) conditionOnJedis.get("values");
        try {
            for (String value : values) {
                Class<?> aClass = Class.forName(String.valueOf(value));
            }
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }
}
