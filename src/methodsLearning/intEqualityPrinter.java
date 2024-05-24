public class intEqualityPrinter {

    /*Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
    If one of the parameters is less than 0, print text "Invalid Value".
    If all numbers are equal print text "All numbers are equal"
    If all numbers are different print text "All numbers are different".
    Otherwise, print "Neither all are equal or different".*/
  
    public static void printEqual(int v1, int v2, int v3) {
        
        if (v1 < 0 || v2 < 0 || v3 < 0) {
            System.out.println("Invalid Value");
        } else if (v1 == v2 && v2 == v3) {
            System.out.println("All numbers are equal");
        } else if (v1 != v2 && v2 != v3 && v1 != v3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
    
}
