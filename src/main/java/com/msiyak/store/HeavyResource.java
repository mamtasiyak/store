package com.msiyak.store;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HeavyResource { //Press Cmd + N to bring up the generate context Menu and generate constructor
    public HeavyResource() {
        System.out.println("Heavy Resource Created");
    }
}
