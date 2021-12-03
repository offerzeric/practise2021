package com.eric.project.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 一般和commandLineRunner只用一个
 *  在spring启动完成后启动
 *
 * @author ericzhang 2021/11/15 9:02 下午
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    private Logger logger = LoggerFactory.getLogger("MyApplicationRunner");

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("MyApplicationRunner is running");

    }
}
