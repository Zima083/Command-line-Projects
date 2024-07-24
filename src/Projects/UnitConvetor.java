package Projects;

import java.util.Scanner;

public class UnitConvetor {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kilometer..");
        double km = sc.nextDouble();
        System.out.println("Kilometer into miles.."+ktm(2));
        System.out.println("Enter the temperature in Celsius");
        Float celsius = sc.nextFloat();
        System.out.println("Tempreature in Fahrenheit.."+temp(37.5f));

    }
    public static double ktm(double km){
        return km * 0.621371;
    }
    public static float temp(float c){
        float F = (c*9/5)+32;
        return F;
    }
}
