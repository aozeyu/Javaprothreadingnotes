package com.example.javaprothreadingnotes;

import com.example.javaprothreadingnotes.stream.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Slf4j
@EnableAspectJAutoProxy
public class JavaprothreadingnotesApplication implements CommandLineRunner {
    private final JdbcTemplate fooTemplete;
    private final JdbcTemplate barTemplate;
    private final JdbcTemplate defaultTemplate;
    static List<Employee> employees = new ArrayList<>();

    public JavaprothreadingnotesApplication(
            @Qualifier("fooJdbcTemplate") JdbcTemplate fooTemplete, @Qualifier("barJdbcTemplate") JdbcTemplate barTemplate, JdbcTemplate defaultTemplate) {
        this.fooTemplete = fooTemplete;
        this.barTemplate = barTemplate;
        this.defaultTemplate = defaultTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaprothreadingnotesApplication.class, args);
    }

    // 启动后自动执行
    @Override
    public void run(String... args) throws Exception {
        fooTemplete.queryForList("select * from USER_INFO").forEach(row -> log.info(row.toString()));
        log.info("----");
        barTemplate.queryForList("select * from USER_INFO").forEach(row -> log.info(row.toString()));
    }
}
