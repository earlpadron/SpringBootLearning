package dev.earlpadron.learning.freeCodeCamp;

import org.springframework.stereotype.Component;

public class MyFirstClass {

    private String myVar;
    public MyFirstClass(String myVar){
        this.myVar = myVar;
    };

    public String sayHello(){
        return "Hello from MyFirst class " + myVar;
    }
}
