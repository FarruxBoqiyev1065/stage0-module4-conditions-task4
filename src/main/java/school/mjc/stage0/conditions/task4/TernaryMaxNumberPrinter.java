package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        System.out.println((third > second && third > first) ? third :
                (second > third && second > first) ? second : first );
    }
}
