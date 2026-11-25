package com.inspirecamp7.myspringbootproject4.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Order(2)
public class MyRuuner implements ApplicationRunner {
    @Value("${myboot.name}")
    String myBootName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("환경변수 myboot.name = "+myBootName);
//      안잡힘
        System.out.println("server.port VM argument 확인 "+args.containsOption("server.port"));
//      잡힘
        System.out.println("myboot.name Program argument 확인 "+args.containsOption("myboot.name"));
        
//      환경변수 목록을 확인하기
        Set<String> optionNames = args.getOptionNames();
        for(String name: optionNames){
            System.out.println("name = "+name);
        }

    }
}
