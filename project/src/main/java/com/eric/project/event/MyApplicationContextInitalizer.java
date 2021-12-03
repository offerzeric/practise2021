package com.eric.project.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 可以使用spring自己的bean 和 environment 在初始化时使用
 * * 需要spring.factories
 *
 * @author ericzhang 2021/11/15 8:34 下午
 */
@Component  //生成bean
public class MyApplicationContextInitalizer implements ApplicationContextInitializer {

    private Logger logger = LoggerFactory.getLogger("MyApplicationContextInitalizer");
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        logger.info("MyApplicationContextInitalizer has started to init the bean from spring");
    }
}
