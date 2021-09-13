package by.banadysev.stage1.part1.task3;

import static java.lang.Math.*;

public class Calc {
    public double calculate (double x, double y) {
        return ((sin(x) + cos(x))/(cos(x)-sin(x)) * tan (x*y));
    }
}
