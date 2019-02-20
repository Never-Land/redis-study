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
        for (int i = 0; i < 10; i++) {
            LOGGER.info("test logger input info {}", i);
            try {
                float j = i / 0;
            }catch (Exception e){
                LOGGER.error("test logger input error ", e);
            }
        }
    }
}
