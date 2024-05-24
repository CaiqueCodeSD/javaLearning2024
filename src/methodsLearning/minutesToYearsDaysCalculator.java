public class minutesToYearsDaysCalculator {
    
    /*Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.*/
  
    public static void printYearsAndDays(long minutes) {
        if (minutes >= 0) {
            long hours = minutes / 60L;
            long days = hours / 24L;
            long years = days / 365L;
            long remainingDays = days % 365L;
            
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
            
        } else {
            System.out.println("Invalid Value");
        }
    }
    
}
