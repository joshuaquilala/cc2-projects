package dimensionarray;
import java.io.*;
import java.lang.String;
import java.util.*;
public class DimensionArray {


    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
       
     
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        
        System.out.println("Enter number of columns: ");
        int columns = sc.nextInt();
        
        int [][] matrix = new int[rows][columns] ;
        
         for(int i=0; i<rows+1; i++){ 
                for(int j =0; j<columns+1; j++){
                    System.out.println("Enter number of row "+ i+ "and column " + j+":");
                    matrix[i][j] = sc.nextInt();
                }
                    
        }
        for(int i = 0; i<matrix.length; i++){
            System.out.println("\n Row: " +i+ "\t Column: " +i);
            for(int j = 0; j<matrix.length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
        }
     
        
  
    
    }
}
    