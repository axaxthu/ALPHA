package LESSON6;
import java.util.*;
//CALC BINOMIAL COEFFICIENT
public class binocoe {
    public static int facto(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfac=facto(n);
        int rfac=facto(r);
        int nrfac=facto(n-r);
        System.out.println(nfac/(rfac*nrfac));
        sc.close();

    }
}
