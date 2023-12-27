import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a number of elements you want to store: ");
        int arrayLength = scanner1.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Enter the elements in the array separated by spaces:");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner1.nextInt();
        }
        System.out.println(isSorted(array));
    }
    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i + 1]){
                return false;
            }
        }
        return true;
    }
}
