package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("\n" +
                "  ██████  ██████  ███    ███ ██████   ██████       ██████ ██   ██ \n" +
                " ██      ██    ██ ████  ████ ██   ██ ██    ██     ██      ██   ██ \n" +
                " ██      ██    ██ ██ ████ ██ ██████  ██    ██     ██      ███████ \n" +
                " ██      ██    ██ ██  ██  ██ ██   ██ ██    ██     ██      ██   ██ \n" +
                "  ██████  ██████  ██      ██ ██   ██  ██████       ██████ ██   ██ \n" +
                "                                                                  \n" +
                "===============================================================\n" +
                ":: 商品管理系统 (COMMODITY MANAGEMENT SYSTEM) ::\n" +
                "===============================================================\n" +
                "本地访问: http://localhost:8090\n" +
                "===============================================================\n");
    }
}