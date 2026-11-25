package com.inspirecamp7.myspringbootproject4.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

// DB를 확인하는 Runner
// Runner에는 규칙이 있다
// https://docs.spring.io/spring-boot/4.0/api/java/index.html
// https://docs.spring.io/spring-boot/4.0/api/java/org/springframework/boot/ApplicationRunner.html

@Component
@Order(1) // runner가 여러 개면 순서 지정 가능 1이 가장 먼저 실행됨
public class DBRunner implements ApplicationRunner {
    @Autowired
    DataSource dataSource;

    //    ApplicationRunner를 override하면 꼭 사용해야하는 메서드
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("DataSource 구현 클래스 이름 = " + dataSource.getClass().getName());
    }
}
