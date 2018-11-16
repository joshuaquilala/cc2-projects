package repetitive;
import java.io.*;
public class GuessingGame {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number to be guessed");
        
        
        int guess = Integer.parseInt(br.readLine());
        if(guess<0 || guess > 1000){
            System.out.println("number should not be less than 0 and greater than 1000");
        }
        System.out.println(". \n"
                + ". \n"
                + ". \n"
                + ". \n"
                + ". \n"
                + ". \n"
                + ". \n"
                + ". \n"
                + ". \n"
                + ". \n"
                + ". \n"
                + ". \n"
                + ". \n"
                + ". \n");
       while(true){
            System.out.println("Choose a number between 1-1000");
           int g = Integer.parseInt(br.readLine());
           
           if(guess== g){
               System.out.println("you are correct!");
               if(g % 2 ==0){
                   System.out.println("the number is even");
               }
               else{
                   System.out.println("the number is odd");
               }
           }
           else if(g < guess && g>0){
               System.out.println("higher!");
                if(g % 2 ==0){
                   System.out.println("the number is even");
               }
               else{
                   System.out.println("the number is odd");
               }
               
           }
           else if(g >guess && g<1001){
               System.out.println("Lower!");
                if(g % 2 ==0){
                   System.out.println("the number is even");
               }
               else{
                   System.out.println("the number is odd");
               }
           }
           else if(g<0 || g>1001){
               System.out.println("invalid input, values should not be less than 0 and greater than 1000");
           }
       }
       
    }
}



