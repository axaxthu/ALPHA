package LESSON3;
import java.util.*;
public class calc {
    public static void main(String[] args) {
        //calculator that adds , subtracts, mutiplies , divides and modulo
      Scanner sc=new Scanner(System.in);
      System.out.print("ENTER FIRST NUMBER: ");
      int a =sc.nextInt();
      System.out.print("ENTER SECOND NUMBER: ");
      int b=sc.nextInt();
      System.out.print("ENTER OPERATOR: ");
      char oper=sc.next().charAt(0); //scanner syntax for character
      switch(oper){
        case '+': System.out.println(a+b);
                 break;
        case '-': System.out.println(a-b);
                 break;
        case '*': System.out.println(a*b);  
                 break;
        case '/':System.out.println(a/b);
                break;
        case '%':System.out.println(a%b); 
                break;
        default:System.out.println("WRONG OPERATION");                                
      }
      sc.close();
    }
}
