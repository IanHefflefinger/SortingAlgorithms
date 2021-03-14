package com.company;

public class Main {
    private static int[] bubbleSort(int[] myArray) {
        // create copy to avoid modifying original array
        int[] sortedArray = myArray.clone();
        // sort
        int temp;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j+1]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        // return sorted array
        return sortedArray;
    }

    private static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void main(String[] args) {
        int myArray[] = new int[] {75, 8, 26, 28, 99, 98, 34, 50, 62, 81, 44, 67, 11, 22, 2, 85, 29, 58, 73, 89, 43, 40, 71, 76, 96, 65, 93, 63, 48, 7, 51, 95, 68, 60, 57, 92, 12, 6, 79, 30, 16, 31, 14, 88, 18, 36, 49, 83, 59, 45, 46, 10, 25, 47, 33, 86, 91, 20, 87, 61, 64, 5, 27, 78, 66, 90, 19, 1, 21, 53, 15, 42, 17, 54, 32, 74, 23, 13, 39, 70, 38, 80, 77, 84, 41, 35, 72, 69, 97, 56, 52, 100, 3, 9, 82, 55, 24, 4, 37, 94};
//        printArray(myArray);
        int[] sortedArray = bubbleSort(myArray);
        printArray(sortedArray);
    }

}
