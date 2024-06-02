import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        //Questão 1: Variáveis

//Create a Java program that declares an integer variable called "age" and assigns it the value 25. Then print the age to the screen.
System.out.println("1. AGE");
int age = 25;
System.out.println("The age is: " + age);
System.out.println("---------------------------");

//2. Escreva um programa que solicite ao usuário que digite seu nome e depois imprima uma mensagem de boas-vindas usando o nome fornecido.
System.out.println("2. WELCOME");
Scanner Scanner = new Scanner(System.in);

System.out.print("What's your name my son? ");
String name = Scanner.nextLine();
System.out.println("Welcome, " + name + "!" );
System.out.println("---------------------------");

//3. Create a program that calculates and prints the area of ​​a rectangle. The program should ask the user for the base and height of the rectangle and then calculate the area (base *height).
System.out.println("3. RECTANGLE");
Scanner form = new Scanner(System.in);

System.out.println("Let's discover the rectangle area: ");
System.out.print("1st. Say to me the base: ");
int base = Scanner.nextInt();

System.out.print("2nd. Say to me the rectangle height: ");
int height = Scanner.nextInt();

System.out.println("The rectangle area is: " + (base*height));

System.out.println("---------------------------");

//4. Create a program that converts a temperature from Fahrenheit to Celsius. The program should prompt the user for a temperature in Fahrenheit, then calculate and print the equivalent in degrees Celsius using the formula: celsius = (fahrenheit -32) *5/9.
System.out.println("4. TEMPERATURE");
Scanner temperature = new Scanner(System.in);

System.out.println("Let's convert Celsius to Fahrenheit: ");
System.out.print("What's the temperature in Fahrenheit? ");
double temp = Scanner.nextDouble();
//(32°F − 32) × 5/9 = 0°C
double celsius = (temp-32) * 5/9;
System.out.println(temp + "°F = " + celsius + "\u00B0C " );

System.out.println("---------------------------");

//Question 5: Expressions with Input and Conditional
//5. Write a program that asks the user to enter an integer and then determines whether that number is even or odd. Print a corresponding message.
System.out.println("5. EVEN OR ODD");
Scanner number = new Scanner(System.in);

System.out.print("Type a random number: ");
int num = Scanner.nextInt();

if (num % 2 == 0) {
    System.out.println("The number " + num + " is EVEN");
}
else {
    System.out.println("The number " + num + " is ODD");
}

System.out.println("---------------------------");

//6. Create a program that prompts the user for their first name and last name separately. Then use these inputs to create and print an email address in the format "first.lastname@example.com".
System.out.println("6. EMAIL ADDRESS");
Scanner adr = new Scanner(System.in);

Scanner.nextLine();

System.out.print("What's your first name: ");
String first = Scanner.nextLine();
System.out.print("What's your last name: ");
String last = Scanner.nextLine();

System.out.println("This is your email address: " + first + "." + last + "@activitie.com");

System.out.println("---------------------------");

//7. Create a program that checks whether a number entered by the user is positive and within the range of 1 to 100. Print appropriate messages based on the check.
System.out.println("7. CHECK AND RANGE");
Scanner pos = new Scanner(System.in);

System.out.print("Enter a number: ");
int ran = Scanner.nextInt();

if (ran > 0) {
    System.out.println("The number " + ran + " is POSITIVE");
    if (ran >= 1 & ran <=100) {
        System.out.println("The number " + ran + " is within the range of 1 to 100");
    }
    else {
        System.out.println("The number " + ran + " is out the range 1 to 100.");
    }
}
else {
    System.out.println("The number " + ran + " is NEGATIVE");
}

System.out.println("---------------------------");

//8. Ask the user to type any word. Then print the number of characters in the word and also print the word in capital letters.
System.out.println("8. LENGHT AND CAPITALIZE");
Scanner carac = new Scanner(System.in);

Scanner.nextLine();

System.out.print("Type a random word: ");
String word = Scanner.nextLine();

System.out.println("Number of characters: " + word.length());
System.out.println("Upper case: " + word.toUpperCase());

System.out.println("---------------------------");

//9. Create a program that calculates the total amount of a purchase. Ask the user for the price of three different products (can be decimal) and calculate the total sum including 10% tax.
System.out.println("9. PURCHASE");
Scanner shop = new Scanner(System.in);

System.out.println("Welcome to our Online Market! What are the prices of the products you want? ");

System.out.print("Product 1: ");
double pr1 = Scanner.nextDouble();

System.out.print("Product 2: ");
double pr2 = Scanner.nextDouble();

System.out.print("Product 3: ");
double pr3 = Scanner.nextDouble();

double total = pr1 + pr2 +pr3;
double tax = (10 * total)/100;
double taxtotal = total + tax;

System.out.println("Total purchase amount: $" + total);
System.out.println("Total purchase amount with 10% tax: $" + taxtotal);

System.out.println("---------------------------");

//10. Write a program that solves the following quadratic equation for x: ax² + bx + c = 0. Ask the user to input the values ​​of a, b, and c, then compute and print the real roots of the equation (take into account the cases of imaginary roots).
System.out.println("10. QUADRATIC EQUATION");
Scanner formula = new Scanner(System.in);

System.out.println("x: ax\u00B2 + bx + c = 0");
System.out.print("Enter 'a' value: ");
int a = Scanner.nextInt();

System.out.print("Enter 'b' value: ");
int b = Scanner.nextInt();

System.out.print("Enter 'c' value: ");
int c = Scanner.nextInt();

int calc = ((a*a) + b) + c;

System.out.println(a + "x²" + " + " + b + "x" + " + " + c + " = 0" );
System.out.println("Equals = " + calc);

System.out.println("---------------------------");

//Lembre-se de que a prática constante é fundamental para aprimorar suas habilidades de programação. Resolva essas questões e procure desafios adicionais para expandir seu conhecimento e domínio da linguagem Java.
    }
}
