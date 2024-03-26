package LESSON4;
import java.util.*;
public class contq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("enter your number: ");
            int n=sc.nextInt();
            if(n%10==0){
                System.out.println("number cannot be printed");
                continue; 
            }
            System.out.println(n);

        }while(true);
        //sc.close();

    }
}
