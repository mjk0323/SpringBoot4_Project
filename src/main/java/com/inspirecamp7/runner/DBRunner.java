package com.inspirecamp7.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

// DB를 확인하는 Runner
// Runner에는 규칙이 있다
// https://docs.spring.io/spring-boot/4.0/api/java/index.html
// https://docs.spring.io/spring-boot/4.0/api/java/org/springframework/boot/ApplicationRunner.html

@Component
public class DBRunner implements ApplicationRunner {
    @Autowired
    DataSource dataSource;
    //    ApplicationRunner를 override하면 꼭 사용해야하는 메서드
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("DataSource 구현 클래스 이름 = "+dataSource.getClass().getName());
    }
}
