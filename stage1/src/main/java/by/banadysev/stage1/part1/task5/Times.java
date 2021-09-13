package by.banadysev.stage1.part1.task5;

public class Times {
    public String formatToString(int t) {
    int h = t / 3600;
    int m = t % 3600 / 60;
    int s = t % 3600 % 60;
    String str = "Часы " + h + " Минуты " + m + " Секунды "+s;
    return str;
    }
}
