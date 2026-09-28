/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortingalgo;

/**
 *
 * @author User
 */
public class MergeSort2 {
    public static void sort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            // Split
            System.out.println("Split: " +
                    java.util.Arrays.toString(
                    java.util.Arrays.copyOfRange(arr, left, right + 1)));

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        // Compare and merge
        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;

            System.out.println("Step: " +
                    java.util.Arrays.toString(
                    java.util.Arrays.copyOf(temp, k)));
        }

        // Remaining left
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining right
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy back
        for (i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }

        System.out.println("Result: " +
                java.util.Arrays.toString(temp));
        System.out.println();
    }
}
    

                     