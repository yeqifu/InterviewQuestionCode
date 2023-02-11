package com.yeqifu.bingfa.threadsafe;

import com.yeqifu.util.LoggerUtils;
import com.yeqifu.util.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: yeqifu
 * @date: 2023/1/1 10:48
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        test2();
    }

    /**
     * 一个线程内调用, 得到的是同一个 Connection 对象
     */
    private static void test2() {
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                LoggerUtils.get("t").debug("{}", Utils.getConnection());
                LoggerUtils.get("t").debug("{}", Utils.getConnection());
                LoggerUtils.get("t").debug("{}", Utils.getConnection());
            }, "t" + (i + 1)).start();
        }
    }

    /**
     * 多个线程调用, 得到的是自己的 Connection 对象
     */
    private static void test1() {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                LoggerUtils.get("t").debug("{}", Utils.getConnection());
            }, "t" + (i + 1)).start();
        }
    }

    static class Utils {
        private static final ThreadLocal<Connection> THREAD_LOCAL = new ThreadLocal<>();

        public static Connection getConnection() {
            Connection connection = THREAD_LOCAL.get();
            if (null == connection) {
                // 创建连接，存入threadLocal
                Connection innerGetConnection = innerGetConnection();
                THREAD_LOCAL.set(innerGetConnection);
                return innerGetConnection;
            }
            return connection;
        }

        /**
         * 得到数据库连接
         *
         * @return
         */
        private static Connection innerGetConnection() {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmdp?useSSL=false", "root", "123456");
                return connection;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
