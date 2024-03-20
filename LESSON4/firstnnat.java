package LESSON4;
import java.util.*;
public class firstnnat {
    public static void main(String[] args) {
        //sum of first n natural numbers
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
