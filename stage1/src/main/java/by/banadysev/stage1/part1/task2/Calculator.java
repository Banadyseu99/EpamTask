package by.banadysev.stage1.part1.task2;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Calculator {
    public double calculate (double a, double b, double c) {
    return ((b+ sqrt(pow(b,2) + 4*a*c))/2*a) - pow(a,3)*c + pow(b,-2);
}
}
