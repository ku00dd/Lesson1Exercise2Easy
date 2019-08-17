/*2)Написать программу которая вычислит и выведет на экран
площадь треугольника если известны его стороны.*/
package com.gmail.dimaku1998;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        float x = 5;
        float y = 6;
        float z = 7;
        float halfMeter = (x + y + z) / (float) 2.0;
        float area = (float) Math.sqrt(halfMeter * (halfMeter - x) * (halfMeter - y) * (halfMeter - z));
        System.out.println("Area = " + area);
    }
}
