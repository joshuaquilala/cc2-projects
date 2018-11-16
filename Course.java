package javaapplication1;
import java.util.*;
public class Course {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("what is your course? "
                + "IT \n"
                + "CS \n"
                + "BSDA");
        try{
           
        String choice = sc.nextLine();
        
        if(choice.equals("IT")){
            System.out.println("what is your major? \n "
                    + "NS - Network and Security \n"
                    + "WT - WebTech \n "
                    + "ERP - Enterprises Resourses Plannig ");
            String who = sc.nextLine();
            if(who.equals("NS")){
                System.out.println("your course is Information Technology major ir Network and Security");
            }else if(who.equals("WT")){
                System.out.println("Your course is Information Technology Major in WebTech");
            }else if (who.equals("ERP")){
                System.out.println("your course is Information Technology major in Enterprises Resourses Plannig");
          }
        }
        else if(choice.equals("CS")){
            System.out.println("What is your major? \n "
                    + "MD - Mobile Development \n"
                    + "DGA - Digital Arts and Animation");
            String fo  = sc.nextLine();
            
            if(fo.equals("MD")){
                System.out.println("your course is Computer Science major in Mobile Development ");
            }else if(fo.equals("DGA")){
                System.out.println("your course is Computer Science major in Digitasl Arts and Animation ");
            }
        
        }
        else if(choice.equals("BSDA")){
            System.out.println("your course is Bachelor os Science in Data Analytics ");
        }

        }catch(Exception e){
            System.out.println("Incorrect niput");
        }
   }
    
}
