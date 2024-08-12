/*Write a method called readInteger() that has no parameters and returns an int.
It needs to read in an integer from the user - this represents how many elements the user needs to enter.
Write another method called readElements() that has one parameter of type int
The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.*/

import java.util.Scanner;
import java.util.Arrays;

public class MinimumElement {

    private static int readInteger() {
        
        Scanner scanner = new Scanner(System.in);
        
        int input = scanner.nextInt();
        return input; 
        
    }
    
    private static int[] readElements(int x) {
        
        Scanner read = new Scanner(System.in);
        int[] array = new int[x];
        
        for (int i = 0; i < x; i++) {
            array[i] = read.nextInt();
        } 
        
        return array;
        
    }
    
    private static int findMin(int[] min) {
        Arrays.sort(min);
        return min[0];
    }
    
}
