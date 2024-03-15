//taking inputs using scanner
package LESSON1;
import java.util.*;
public class input{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String cha=sc.next();
        String s=sc.nextLine();
        float f=sc.nextFloat();
        //OTHER TYPES ARE nextShort,nextByte,nextLong,nextDouble
        System.out.println(num+" "+cha+" "+s+" "+f);
    }
}


