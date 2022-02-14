package com.company;

import java.text.DecimalFormat;

public class Class {
    private final static float PI = 3.1415f;
    private static float radius;

    public static void area() {
        float area = PI * (radius * radius);
        System.out.println("Area: " + area);
    }
    public static void circumference() {
        float circumference = PI * 2 * radius;
        System.out.println("Circumference: " +circumference);
    }

    public static float getRadius() {
        return radius;
    }

    public static void setRadius(float radius) {
        Class.radius = radius;
    }
}
