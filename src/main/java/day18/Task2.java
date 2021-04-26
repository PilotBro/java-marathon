package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int number) {
        int count = 0;
        if (number == 0) {
            return 0;
        }
        if ((number % 10) == 7) {
            count++;
        }
        return count + count7(number / 10);
    }
}
