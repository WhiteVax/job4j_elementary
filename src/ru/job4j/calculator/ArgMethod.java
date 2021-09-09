package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name, String age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        String age = "33";
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(age, name);
        ArgMethod.hello(age, name);
    }
}
