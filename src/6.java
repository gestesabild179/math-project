  package com.example;

import java.util.Random;

public class MathProject {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        System.out.println(num1 + " + " + num2 + " = ");
    }
}