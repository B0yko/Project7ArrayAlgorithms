import java.util.Random;
import java.util.Scanner;
public class Part1Bubble {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello, now I will sort your numbers");
        while (true) {
            System.out.println("Do yoy want to enter numbers by yourself? (Y/N)");
            String answer = in.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                userArray();
            } else randomArray();
            System.out.println("Do you want to start again? (Y/N)");
            String sanswer = in.nextLine();
            if (!sanswer.equalsIgnoreCase("y")) {
                System.exit(0);
            }
        }
    }
    public static void randomArray() {
        Random random = new Random();
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        for (int i = 0; i < a.length; i++) {
            if (i == (a.length - 1)) {
                System.out.print(a[i] + "\n");
            } else if (i < a.length - 1) {
                System.out.print(a[i] + ", ");
            }
        }
        bubbleSort(a);
        System.out.println("----------------------------");
        for (int i = 0; i < a.length; i++) {
            if (i == (a.length - 1)) {
                System.out.print(a[i] + "\n \n");
            } else if (i < a.length - 1) {
                System.out.print(a[i] + ", ");
            }
        }
    }

    public static void userArray() {
        int[] a = inputArray();
        for (int i = 0; i < a.length; i++) {
            if (i == (a.length - 1)) {
                System.out.print(a[i] + "\n");
            } else if (i < a.length - 1) {
                System.out.print(a[i] + ", ");
            }
        }
        bubbleSort(a);
        System.out.println("---------------------------");
        for (int i = 0; i < a.length; i++) {
            if (i == (a.length - 1)) {
                System.out.print(a[i] + "\n \n");
            } else if (i < a.length - 1) {
                System.out.print(a[i] + ", ");
            }
        }
    }
    public static int[] inputArray() {
        System.out.print("Enter the length of the array: ");
        int length = in.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = in.nextInt();
        }
        return array;
    }
    public static void bubbleSort(int[] a) {
        boolean swapped;
        for (int i = 0; i < a.length - 1; i++) {
            swapped = false;
                /*System.out.println("Outer loop, iteration " + (i + 1) + ":");
                printArray(a);*/
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                    /*System.out.println("Inner loop, iteration " + (j + 1) + ":");
                    printArray(a);*/
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
        public static void printArray ( int[] a){
            for (int num : a) {
                System.out.print(num + "  ");
            }
            System.out.println("\n");
        }
    }
