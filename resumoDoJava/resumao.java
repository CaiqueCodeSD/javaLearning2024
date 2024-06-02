import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class resumao {
    public static void main(String[] args) {
        //VARIABLES (22/08/23)
    System.out.println("---------------------------");
    System.out.println("VARIABLES");
    int x = 7;
    long y = 777777777;
    float xy = 3.14f;
    double yx = 3.14;
    boolean xyz = true;
    char symbol = 'Z';
    String name = "Chikara";
    System.out.println("The int number is: " + x);
    System.out.println("The long number is: " + y);
    System.out.println("The float is: " + xy);
    System.out.println("The double is: " + yx);
    System.out.println("The boolean result is: " + xyz);
    System.out.println("The char is: " + symbol);
    System.out.println("The String is: " + name);
    System.out.println("---------------------------");

        //USER INPUT (23/08/23)
    System.out.println("USER INPUT");
    Scanner Scanner = new Scanner(System.in);

    System.out.print("What's your name? ");
    String nick = Scanner.nextLine();

    System.out.print("How old are you? ");
    int age = Scanner.nextInt();

    Scanner.nextLine(); //You need to call a "next.line" to answer the next String

    System.out.print("What's your favorite food? ");
    String food = Scanner.nextLine();

    System.out.println();

    System.out.println("Welcome, " + nick);
    System.out.println("Your age is: " + age);
    System.out.println("Favorite food: " + food);
    System.out.println("---------------------------");

        //EXPRESSIONS (23/08/23)
    System.out.println("EXPRESSIONS + - / *");

    int friends = 2;
    
    friends++;
    //friends = friends / 2;
    //friends = (double) friends / 3;

    System.out.println(friends);

    System.out.println("---------------------------");

        //GUI INTRO (24/08/23)
    System.out.println("GUI INTRO");

    String nome = JOptionPane.showInputDialog("Enter your name: ");
    JOptionPane.showMessageDialog(null,"Hello, " + nome);

    int idade = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
    JOptionPane.showMessageDialog(null,"Your age is: " + idade);

    double altura = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
    JOptionPane.showMessageDialog(null,"Your height is: " + altura + "cm");

    System.out.println("---------------------------");

        //RANDOM VALUES (24/08/23)
    System.out.println("RANDOM NUMBERS");

    Random random = new Random();

    int X = random.nextInt(100)+1; //generates a random number between 0 and 100 when uses +1
    //double Y = random.nextDouble();
    //boolean Z = random.nextBoolean();

    System.out.println(X);

    System.out.println("---------------------------");

        //IF STATEMENTS (24/08/23)
    System.out.println("IF STATEMENTS");
    Scanner era = new Scanner(System.in);
    
    System.out.println("How old are you? ");
    int ega = Scanner.nextInt();

    if (ega>=65) {
        System.out.println("An old and wise person!");
    }
    else if (ega >= 18) {
        System.out.println("You're an adult! With great powers come great responsabilities! ");
    }
    else if (ega >= 13) {
        System.out.println("You're young yet! Live the moment wisely!");
    }
    else {
        System.out.println("You're a child!");
    }

    System.out.println("---------------------------");

        //SWITCH (24/08/23)
    System.out.println("SWITCH");
    Scanner week = new Scanner(System.in);
    
    System.out.println("[ SUN - MON - TUE - WED - THU - FRI - SAT ]");
    System.out.println("What day is it today?");

    Scanner.nextLine();
    String day = Scanner.nextLine();

    switch (day) {
        case "SUN" : System.out.println("It's SUNDAY!");
        break;
        case "MON" : System.out.println("It's MONDAY!");
        break;
        case "TUE" : System.out.println("It's TUESDAY!");
        break;
        case "WED" : System.out.println("It's WEDNESDAY!");
        break;
        case "THU" : System.out.println("It's THURSDAY!");
        break;
        case "FRI" : System.out.println("It's FRIDAY!");
        break;
        case "SAT" : System.out.println("It's SATURDAY!");
        break;
        default:
            break;
    }

    System.out.println("---------------------------");

     //LOGICAL OPERATORS (24/08/23)
    System.out.println("LOGICAL OPERATORS");
    Scanner logi = new Scanner(System.in);

    System.out.println("You're playing a game! Press q or Q to quit ");
    String response = Scanner.next();

    if (response.equals("q") || response.equals("Q")) {
        System.out.println("You quit the game");
    }
    else {
        System.out.println("You are still playing the game 'Alfred, activate the KnightFall Protocol.'");
    }

    System.out.println("---------------------------");

    //&& (AND) both cond must be true
    //|| (OR) either condition must be true
    //! (NOT) reverses boolean value of condition

    System.out.println("&& (AND) both cond must be true");
    System.out.println("|| (OR) either condition must be true");
    System.out.println("! (NOT) reverses boolean value of condition");

    System.out.println("---------------------------");

    //WHILE LOOP (10/09/23)
    System.out.println("WHILE LOOP");

    Scanner scanner = new Scanner(System.in);
    String name3 = "";

    Scanner.nextLine();

    while (name3.isBlank()) {
        System.out.println("Enter your name: ");
        name3 = Scanner.nextLine();
    }

    System.out.println("Hello, " + name3);

    System.out.println("---------------------------");

    //FOR LOOP (18/09/23)
    System.out.println("FOR LOOP");

    int sum = 0;

    for (int i = 0; i < 10; i++) {
        System.out.println("From 0 to " + i);
    }

    System.out.println("---------------------------");

    //NESTED LOOPS - A LOOP INSIDE OF A LOOP (19/09/23)
    System.out.println("NESTED LOOPS");

    Scanner lop = new Scanner(System.in);
    int rows;
    int columns;
    String symbols = "";

    System.out.print("Enter # of rows: ");
    rows = Scanner.nextInt();
    System.out.print("Enter # of columns: ");
    columns = Scanner.nextInt();
    System.out.print("Enter a symbol to use: ");
    symbols = scanner.nextLine();

    for (int i = 1; i <= rows; i++) {
        System.out.println();
        for (int j = 1; j <= columns; j++) {
            System.out.print(symbols);
        }
    }

    System.out.println();
    System.out.println("---------------------------");

    // ARRAY - USED TO STORE MULTIPLE VALUES IN A SINGLE VARIABLE (19/09/23)
    System.out.println("ARRAYS");

    String[] cars = {"Camaro","Ferrari","Porsche"};

    System.out.println(cars[0]); //computer always starts with 0

    for (int I = 0; I < cars.length; I++) {
        System.out.println(cars[I]);
    }

    System.out.println("---------------------------");

    }
}
