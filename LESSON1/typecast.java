package LESSON1;
//import java.util.*;
//explicit FORCEFUL CONVERSION
public class typecast {
    public static void main(String[] args) {
      //Scanner sc=new Scanner(System.in);
      float a =25.12F; //round off is always to lower value
      int b=(int)a;
      System.out.println(b); //output will be 25 (even if input was 25.99)
      char ch='a';
      int num=ch;
      System.out.println(num); //OUTPUT WILL BE 97
      

    }
}
