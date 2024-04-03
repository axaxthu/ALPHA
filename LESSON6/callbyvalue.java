package LESSON6;

public class callbyvalue {
    public static void swap(int a , int b,int sum){
        sum=a+b;
        System.out.println("VALUE IN function: "+sum); //sum will be 15 here because value was taken but value will not be changed in main

    }
    public static void main(String[] args) {
        int sum=0;
        int a=5,b=10;
        swap(a, b,sum);
        System.out.println("VALUE IN MAIN: "+sum); //sum will be zero because value of sum was sent as call by value not by reference
    }
}
