package by.banadysev.stage1.part1.task6;

public class LocationValidator {
    public boolean validate (double x,double y) {
        boolean isLocated = false;
        if (y >= 0 && y <= 4) {
            if (x >= -2 && x <= 2) {
                isLocated = true;
            }
        } else if (y <= 0 && y <= -3) {
            if (x >= -4 && x <= 4) {
                isLocated = true;
            }
        }
        return isLocated;
    }
}

