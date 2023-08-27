package com.javaLang.serializable;
import java.io.Serializable;

public class ClassA extends ClassC implements Serializable {
    public transient int j;
    public int i;
    public ClassB classBInstance;

    public ClassA() {
        classBInstance = new ClassB();
    }
}
