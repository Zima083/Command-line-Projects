package Projects;

import java.util.Scanner;

public class simpleQuiz {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String answer[]={"1","3","2"};
        String resp[]= {"","",""};
        System.out.println("What is your name? ");
        System.out.println("1.Zeema");
        System.out.println("2.Ali");
        System.out.println("3.Khan");
        //==============================
        System.out.println("What is your age? ");
        System.out.println("1.18");
        System.out.println("2.19");
        System.out.println("3.22");
        //==============================
        System.out.println("Where are you from? ");
        System.out.println("1.Bagh");
        System.out.println("2.Lahore");
        System.out.println("3.Dana");
        resp[0]=sc.next();
        resp[1]=sc.next();
        resp[2]=sc.next();
        System.out.println("Value of Q1"+resp[0]);
        System.out.println(resp[1]);
        System.out.println(resp[2]);
        int score=0;
        for (int i=0;i<3;i++){
            //Ignorecase means didnot check upper or lower case.
            if (resp[i].equalsIgnoreCase(answer[i])){
                score++;
            }
        }
        System.out.println("Score :"+score +"/3");
    }
}
