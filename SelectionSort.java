/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortingalgo;

/**
 *
 * @author User
 */
public class SelectionSort {
     int[] TestArray;

    // Constructor
    public SelectionSort(int[] val) {
        this.TestArray = val;
    }

    // Sort Elements Method
    public void sortElements() {

        int len = TestArray.length;

        for (int i = 0; i < len - 1; i++) {

            int min = i;

            System.out.println("Iteration " + (i + 1));
            System.out.println("Array: "
                    + java.util.Arrays.toString(TestArray));

            // Find smallest element
            for (int j = i + 1; j < len; j++) {

                if (TestArray[j] < TestArray[min]) {
                    min = j;
                }
            }

            // Swap
            int temp = TestArray[i];
            TestArray[i] = TestArray[min];
            TestArray[min] = temp;

            System.out.println("After swap: "
                    + java.util.Arrays.toString(TestArray));
            System.out.println();
        }
    }

    // Display Elements
    public void displayElements() {

        for (int a : TestArray) {
            System.out.print(a + " ");
        }

        System.out.println();
    }
}
    

