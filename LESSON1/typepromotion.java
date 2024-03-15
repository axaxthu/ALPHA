package LESSON1;

public class typepromotion {
    public static void main(String[] args) {
        //JAVA AUTOMATICALLY PROMOTES EACH BYTE,SHORT OR CHAR OPERAND TO INT WHEN EVALUATING AN EXPRESSION.
        //example1
        char a='a';
        char b='b';
        System.out.println(b-a); //output will be 1
        
        //IF ONE OPERAND IS LONG,FLOAT OR DOUBLE THEN THE WHOLE EXPRESSION IS PROMOTED TO LONG,FLOAT OR DOUBLE RESPECTIVELY.
        int x=5;
        float y=10.25f;
        long c=25;
        double d=30;
        double ans=x+y+c+d;
        System.out.println(ans); //ans will be in double becasue it is the greatest in the expressions
        //type promotion in expressions
        byte b1=5;
        byte a1=(byte)(b1*2); //byte a=b*2 is error
        System.out.println(a1);


    }
}
