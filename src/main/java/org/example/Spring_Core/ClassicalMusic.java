package org.example.Spring_Core;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * @author Дмитрий Карпушов 05.09.2022
 */

public class ClassicalMusic implements Music {
    @Override
    public  String getSong() {
        return "ClassicalMusic";
    }
    @PostConstruct
    public void doMyInit(){
        System.out.println("Инициализация");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Убит бин");
    }
}
