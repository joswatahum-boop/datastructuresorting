package sortingalgo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BubbleTest {
    public static void main(String[] args){
        
        
        int[] numbers = {5,3,8,4,2,1,7,6};
        
        BubbleSort bubbleSort = new BubbleSort(numbers);
        
        System.out.println("Before Sorting:");
        bubble.print();
        
        System.out.println("\nBubble sort: ");
        
        bubbleSort.sort();
        
        System.out.println("\nAFTER sorting: ");
        bubble.print();
    }
    
}
