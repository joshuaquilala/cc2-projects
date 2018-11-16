package usernamepassword;
import java.io.*;

public class UsernamePassword {

    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter username");
        String name = br.readLine();
        
        System.out.println("Enter password");
        String pass = br.readLine();
        
        System.out.println("Verify your Password");
        String very=br.readLine();
        
        if(pass.equals(pass)){
            System.out.println("your password is correct");
        }
        else{
            System.out.println("incorrect password");
        }
        
        
    }
    
}
