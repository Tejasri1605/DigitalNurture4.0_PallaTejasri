package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int[] getNumbers() {
        return new int[]{1, 2, 3};
    }

    public String getGreeting(String name) {
        return name == null ? null : "Hello, " + name;
    }

    public Object getNullValue() {
        return null;
    }

    public Object getSameReference() {
        return this;
    }
}
