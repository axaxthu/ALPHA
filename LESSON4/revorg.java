package LESSON4;
import java.util.*;
public class revorg {
    public static void main(String[] args) {
      //reverse of a number stored
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        System.out.println(rev);
        sc.close();

    }
}


