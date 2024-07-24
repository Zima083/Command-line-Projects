package Projects;
import java.io.*;
public class Word {
    public static void main(String[] args) throws Exception{
        FileInputStream fis  = new FileInputStream("C:/Users/zimaj/Desktop/Java/Zima.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String word ;
        int count =0;
        while ((word = br.readLine()) != null) {
           String words[]= word.split(" ");
            count = count+words.length;
        }
        System.out.println("Numbers of words.."+count);
        br.close();
    }
    }

