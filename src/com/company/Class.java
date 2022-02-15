package com.company;

import java.text.DecimalFormat;

public class Class {
    private final static float PI = 3.1415f;

    public static void area(float radius) {
        float area = PI * (radius * radius);
        System.out.println("Area: " + area);
    }
    public static void circumference(float radius) {
        float circumference = PI * 2 * radius;
        System.out.println("Circumference: " +circumference);
    }
}
