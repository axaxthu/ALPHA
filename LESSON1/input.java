//taking inputs using scanner
package LESSON1;
import java.util.*;
public class input{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //String cha=sc.next(); - THIS METHOD PRINTS JUST ONE WORD(STOPS ONCE SPACE IS ENCOUNTERED)
        String s=sc.nextLine(); //PRINTS THE WHOLE SENTENCE
        float f=sc.nextFloat();
        //OTHER TYPES ARE nextShort,nextByte,nextLong,nextDouble
        System.out.println(num+" "+s+" "+f);
        sc.close();
    }
}


