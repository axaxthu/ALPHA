package LESSON4;
import java.util.*;
public class revno {
    public static void main(String[] args) {
      //reverse of a number
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int ld=n%10;
            System.out.print(ld);
            n=n/10;
        }
        
        sc.close();

    }
}
