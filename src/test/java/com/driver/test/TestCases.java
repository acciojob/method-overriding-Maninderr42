package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
class A{
    public static String meth(){
        return "Invoking method from class A";
    }
}
class B extends A {
    public static String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class TestCases {
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.meth());
    }
}
