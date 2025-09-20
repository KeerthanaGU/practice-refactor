public class TestPractice {

    public static final int FIRST_NUMBER1 = 10;
    public static final int SECOND_NUMBER1 = 20;
    public static final int FIRST_NUMBER2 = 15;
    public static final int SECOND_NUMBER2 = 25;
    public static final int FIRST_NUMBER3 = 100;
    public static final int SECOND_NUMBER3 = 200;

    public static void main(String[] args) {
        addAndPrint(FIRST_NUMBER1, SECOND_NUMBER1);
        addAndPrint(FIRST_NUMBER2, SECOND_NUMBER2);
        addAndPrint(FIRST_NUMBER3, SECOND_NUMBER3);
    }

    public static void addAndPrint(int x, int y) {
        int sum = x + y;
        System.out.println("Sum: " + sum);
    }
}
