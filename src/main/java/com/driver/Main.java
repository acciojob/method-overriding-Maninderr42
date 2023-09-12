package com.driver;
public class Main {

public static class A{
    public  String meth(){

        return "Invoking method from class A";
    }
}
public static class B extends A{

    public  String meth(){
        super.meth();
        return "Method is overridden in Extendend class B";
    }
}
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.meth());
    }
}
        