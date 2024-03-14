package lesson1;

//inputs using Scanner
import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input= sc.next(); //for single word input
        //String inp=sc.nextLine(); // for sentences
        int num=sc.nextInt();
        float price=sc.nextFloat();
        System.out.println(num);
        //System.out.println(inp);
        System.out.println(input);
        System.out.println(price);
        //nextByte,nextDouble,nextShort,nextLong,nextBoolean
      }
}
