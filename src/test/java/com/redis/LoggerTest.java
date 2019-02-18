package com.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志输出测试类
 */
public class LoggerTest {
    /**
     * 日志记录
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerTest.class);

    public static void main(String[] args){
        LOGGER.info("test logger input");
    }
}
