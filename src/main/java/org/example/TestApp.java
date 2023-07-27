package org.example;

public class TestApp {
    public static void main(String[] args) {
        Sum sum = new Sum() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
    }

}
