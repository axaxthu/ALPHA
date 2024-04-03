package LESSON6;
import java.util.*;
public class para {
    public static void calcsum(int n1,int n2){ //formal parameters
        int sum=n1+n2;
        System.out.println("SUM IS : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calcsum(a, b);//actual parameters
        sc.close();
    }
}
