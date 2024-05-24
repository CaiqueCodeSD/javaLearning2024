public class teenNumberChecker {

    /*We'll say that a number is "teen" if it is in the range 13 - 19 (inclusive).
    Write a method named hasTeen with 3 parameters of type int.
    The method should return boolean and it needs to return true if one of the parameters is in range 13 (inclusive) - 19 (inclusive). Otherwise return false.*/
  
    public static boolean hasTeen(int t1, int t2, int t3) {
        
        if ((t1 >= 13 && t1 <= 19) || (t2 >= 13 && t2 <= 19) || (t3 >= 13 && t3 <= 19)) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public static boolean isTeen(int teen) {
        
        if (teen >= 13 && teen <= 19) {
            return true;
        } else {
            return false;
        }
        
    }
    
}
