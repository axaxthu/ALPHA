package LESSON4;
import java.util.*;
public class onetn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int c=1;
        while(c<=range){
            System.out.print(c+" ");
            c++;
        }
        sc.close();
        //program prints numbers from 1 to n
    }
}
