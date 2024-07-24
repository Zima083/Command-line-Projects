package Projects;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your operation..");
        System.out.println("1 For addition.");
        System.out.println("2 For subtraction.");
        System.out.println("3 For multiplication.");
        System.out.println("4 For division.");
        int choice = sc.nextInt();
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        if (choice == 1) {
            System.out.println("the answer is,"+Addition(a,b));
        }
        else if (choice == 2) {
            System.out.println("The answer is"+Subtraction(a,b));
        }
        else if (choice == 3) {
            System.out.println("The answer is"+Multiplication(a,b));
        }
        else if (choice == 4) {
            System.out.println("The answer is"+Division(a,b));
        }
        else {
            System.out.println("Invalid choice");
        }
    }
    public static int Addition(int a, int b) {
       int n;
        n= a + b;
        return n;
    }
    public static int Subtraction(int a, int b) {
        int n;
        n= a - b;
       return n;
    }
    public static int Multiplication(int a, int b) {
        int n;
        n= a * b;
        return n;
    }
    public static int Division(int a, int b) {
        int n;
        n= a / b;
       return n;
    }
}
