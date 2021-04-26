package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] array, int count) {
        if (count == array.length) {
            return 0;
        }
        int sum = array[count];
        return sum + recursionSum(array, count + 1);
    }


}

