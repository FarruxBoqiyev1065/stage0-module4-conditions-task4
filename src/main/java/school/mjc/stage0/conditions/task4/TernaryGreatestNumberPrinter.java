package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int a = (second > first)? second : first;
        System.out.println(a);
    }
}
