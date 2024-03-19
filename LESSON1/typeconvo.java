package LESSON1;
import java.util.*;
//TYPE CONVERSION IS THAT WHICH IS AUTOMATIC ie We are not forcing it to change(implicit) 
public class typeconvo {
    public static void main(String[] args) {
        int a=25;
        long b=a;
        System.out.println(b);
        Scanner sc=new Scanner(System.in);
        float num=sc.nextInt(); //here automatic type conversion happens
        //int num=sc.nextFloat(); this is error since float is bigger than int
        System.out.println(num);
        sc.close();
    }
}
/*RULES FOR TYPE CONVERSION
 IN java you can convert numbers to numberrs but not numbers to other data types like int to boolean
 IN java source shud be smaller than destination like you can convert int to long but not long to int as long is bigger than int
 ORDER IS: byte>short>int>float>long>double
 */