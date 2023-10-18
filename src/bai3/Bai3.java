package bai3;

public class Bai3 {
    public static void main(String[] args) {

        String[] arr = {"banana", "apple", "orange", "grape", "pear"};

//        System.out.println("Mảng trước khi sắp xếp:");
//        printArray(arr);
//
//        bubbleSort(arr);
//
//        System.out.println("Mảng sau khi sắp xếp:");
//        printArray(arr);

//        System.out.println("Mảng trước khi sắp xếp:");
//        printArray(arr);
//
//        inserSort(arr);
//
//        System.out.println("Mảng sau khi sắp xếp:");
//        printArray(arr);

        System.out.println("Mảng trước khi sắp xếp:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    //sap xep chen
    public static void inserSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }


    public static void selectionSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
