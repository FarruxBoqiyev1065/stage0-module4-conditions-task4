package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if ((third > second && second > first) || (third > second && second < first)){
            System.out.println(third);
        } else if ((second > third && third >= first) || (second > third && third <= first)) {
            System.out.println(second);
        }else {
            System.out.println(first);
        }
    }
}
