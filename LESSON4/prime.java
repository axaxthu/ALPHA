package LESSON4;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        if(n==1){
            System.out.println("NEITHER PRIME NOR COMPOSITE");
            System.exit(02);
        }
        if(n==2){
            System.out.println("PRIME NO");
        }
        else{
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){ //math.sqrt reduces time complexity
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.println("PRIME NO!!!");
        }
        else{
            System.out.println("not PRIME NO!!!");
        }
    }
    sc.close();
}
}
