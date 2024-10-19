package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Факториал 0:" + getFactorialByNum(0));
    }

    public static int getFactorialByNum(int num){
        return num == 0 ? 1 : num * getFactorialByNum(num-1);
    }
}