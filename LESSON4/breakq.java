package LESSON4;
import java.util.*;
//keep entering numbers till user enters a multiple of 10
public class breakq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         do{
            System.out.print("ENTER YOUR NUMBER: ");
            int n=sc.nextInt();
            if(n%10==0){
                System.err.println("PROGRAM TERMINATED :(");
                break;
            }
            System.err.println(n);
         }while(true);
         sc.close();
    }
}
