package tablearray;
import java.io.*;
import java.util.ArrayList;

public class OddEven {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        

        int nums[] = new int[10];
        
        System.out.println("Enter elements");
        for(int q=0; q<9;q++){
            nums[q]=Integer.parseInt(br.readLine());
        }
        
        ArrayList <Integer> even = new ArrayList<Integer>();
        ArrayList <Integer>odd = new ArrayList<Integer>();
         
        
        for(int i=0; i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
        }
            else{
                odd.add(nums[i]);
            }
        }
        System.out.println("Odd \t Even");
        for(int x=0; x<5;x++){
            System.out.println(odd.get(x) + "\t" + even.get(x));
        }
        
    }
    
}
