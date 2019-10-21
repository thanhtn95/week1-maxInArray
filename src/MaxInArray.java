import java.util.ArrayList;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size :");
        int size = sc.nextInt();
        int[] numbers = getArray(size);
        System.out.println("Number Array: ");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else System.out.print(numbers[i]);
        }
        System.out.println();
        int max = getMax(numbers);
        ArrayList<Integer> index = getMaxIndex(numbers, max);
        System.out.println("Max of Array is " + max + " at position : ");
        for (int i : index) {
            System.out.print(i + ", ");
        }
    }

    private static int[] getArray(int size) {
        int[] tmp = new int[size];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = (int) Math.floor(Math.random() * 100);
        }
        return tmp;
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    private static ArrayList<Integer> getMaxIndex(int[] arr, int max) {
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) index.add(i);
        }
        return index;
    }
}
