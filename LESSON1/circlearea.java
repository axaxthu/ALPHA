package LESSON1;
//formula is pie*radius(squared)
import java.util.*;
public class circlearea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float rad=sc.nextFloat();
        float area=3.14f*rad*rad;//f here indicates decimal is float 
        System.out.println("AREA OF THE CIRCLE IS "+area);
        sc.close();
    }
}
