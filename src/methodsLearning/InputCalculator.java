/*Write a method called inputThenPrintSumAndAverage that does not have any parameters.
The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.*/

import java.util.Scanner;

public class InputCalculator {
    // write code here
    public static void inputThenPrintSumAndAverage(){
        
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        double cont = 0;
        long average = 0;
        
        while(sc.hasNextInt()) {
            sum+=sc.nextInt();
            cont++;
        }
        sc.close();
        
        if (cont > 0){
            average = Math.round(sum / cont);
        }
        
        System.out.println("SUM = " + sum + " AVG = " + average);
        
    }
    
}
