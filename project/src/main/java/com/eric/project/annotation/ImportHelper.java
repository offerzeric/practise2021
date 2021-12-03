package com.eric.project.annotation;



import com.eric.project.config.AppleImportSelectorImpl;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * description
 *
 * @author ericzhang 2021/11/14 8:13 下午
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(AppleImportSelectorImpl.class)
@ConditionOnJedis(values = "redis.clients.jedis.Jedis")
public @interface ImportHelper {
}
