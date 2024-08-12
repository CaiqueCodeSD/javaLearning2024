/*Create a program using arrays that sorts a list of integers in descending order.Descending order is highest value to lowest.
In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately have an array with [106, 81, 26, 15, 5] in it.
Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
Implement the following methods:
getIntegers has one parameter of type int which is the size of the array. It returns an array of entered integers from the keyboard.
printArray accepts an array and prints out the contents of the array. It should be printed in the following format: Element 0 contents 106
sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers.*/

import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {

    public static int[] getIntegers(int x) {
        Scanner scanner = new Scanner(System.in);
    
        int[] enteredNumbers = new int[x];
    
        for (int i = 0; i < x; i++) {
            enteredNumbers[i] = scanner.nextInt();
        }
        return enteredNumbers;
    }
    
    public static void printArray(int[] array) {
        int x = array.length;
        
        for (int i = 0; i < x; i++) {
            System.out.println("Element " + i + " contents " + array[i]);    
        }
        
    }
    
    public static int[] sortIntegers(int[] array) {
        int[] reverseArray = new int[array.length];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        return reverseArray;
    }
    
}
    
