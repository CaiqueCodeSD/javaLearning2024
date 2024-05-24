public class decimalComparator {
  
    /*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.*/
  
    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
        
        if ((long)(n1 * 1000) == (long)(n2 * 1000)) {
            return true;
        } else {
            return false;
        }
        
    }
    
}
