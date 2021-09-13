package by.banadysev.stage1.part2.task1;

public class TrangleValidator {
    public boolean validateIfExist (int alpha, int beta) {
        return (alpha + beta) < 180.0;
}
    public boolean validateIfRectangular (int alpha, int beta, int gamma) {
        return  (alpha == 90 || beta == 90 || gamma == 90);
    }
}
