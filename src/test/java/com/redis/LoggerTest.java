package com.redis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 日志输出测试类
 */
public class LoggerTest {
    /**
     * 日志记录
     */
    private static final Logger LOGGER = LogManager.getLogger(LoggerTest.class);

    public static void main(String[] args){
        LOGGER.info("test logger input");
    }
}
