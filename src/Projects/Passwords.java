package Projects;

import java.util.Random;
import java.util.Scanner;

public class Passwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower ="abcdefghiklmnopqrstuywxyz";
        System.out.println("Enter the password length..");
        int digits = sc.nextInt();
        String password = "";
        for (int i = 0; i < digits; i++) {
        int rand = (int) (3*Math.random());
        switch (rand){
            case 0:
                password += String.valueOf((int)(0*Math.random()));
                break;
                case 1:
                    rand = (int)(lower.length()*Math.random());
                    password +=String.valueOf(lower.charAt(rand));
                    break;
                    case 2:
                        rand = (int)(upper.length()*Math.random());
                        password +=String.valueOf(upper.charAt(rand));
           break;
        }
        }
        System.out.println("The password is: "+password);

    }
}
