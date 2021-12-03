package com.eric.project.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

/**
 * 需要构造方法 不需要@Component
 * 需要spring.factories
 *
 * @author ericzhang 2021/11/15 8:46 下午
 */
public class MySpringApplicationRunListener implements SpringApplicationRunListener {

    private Logger logger = LoggerFactory.getLogger("MySpringApplicationRunListener");
    public MySpringApplicationRunListener(SpringApplication application, String[] args){

    }

    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        starting();
        logger.info("start finished");
    }


    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext,
                                     ConfigurableEnvironment environment) {
        environmentPrepared(environment);
        logger.info("environmentPrepared finished");
    }


    public void contextPrepared(ConfigurableApplicationContext context) {
        logger.info("contextPrepared finished");

    }


    public void contextLoaded(ConfigurableApplicationContext context) {
        logger.info("contextLoaded finished");
    }

    public void started(ConfigurableApplicationContext context) {
        logger.info("started finished");

    }

    public void running(ConfigurableApplicationContext context) {
        logger.info("running finished");

    }


    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        logger.info("failed finished");

    }

}
