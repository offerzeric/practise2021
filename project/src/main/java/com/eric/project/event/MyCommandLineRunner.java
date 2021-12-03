package com.eric.project.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 在spring启动完成后启动
 *
 * @author ericzhang 2021/11/15 9:00 下午
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger("MyCommandLineRunner");

    @Override
    public void run(String... args) throws Exception {
        logger.info("MyCommandLineRunner is running");
    }
}
