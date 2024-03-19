package LESSON3;
import java.util.*;
public class incometax {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      int inc=sc.nextInt();
      int tax;
      if(inc<500000){
        tax=0;
      }
      else if(inc>=500000 && inc<1000000){
        tax=(int)(inc*0.2);//type casting is done cuz 0.2 is there so inc will be made to double so output will also be double 
      }
      else{
        tax=(int)(inc*0.3);
      }
      System.out.println("your tax is: "+tax);
      sc.close();
    }
}
