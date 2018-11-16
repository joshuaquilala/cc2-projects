package calculator;
import java.io.*;

public class Calculator {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wecome to the Calculator");
        System.out.println("Enter first value");
        
        double v1 = Integer.parseInt(br.readLine());
      
        System.out.println("Enter Operator \n"
                + "+ \n"
                + "- \n"
                + "* \n"
                + "/ \n");
        String operator = br.readLine();
        System.out.println("Enter second value");
        double v2 = Integer.parseInt(br.readLine());
        
        
        if(operator.equals("+")||operator.equals("add")){
            System.out.println("Total:" + (v1+v2));
        }else if(operator.equals("-")|| operator.equals("subtract")){
            System.out.println("Total:" + (v1-v2));
        }else if(operator.equals("*")||operator.equals("multipy")){
            System.out.println("Total: "+(v1*v2));
        }else if(operator.equals("/")||operator.equals("divide")){
            System.out.println("Total: "+ (v1/v2));
        }
    }
    
}
