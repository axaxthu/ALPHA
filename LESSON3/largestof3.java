package LESSON3;

public class largestof3 {
    public static void main(String[] args) {
        int a=1,b=3,c=6;
        System.out.print("THE LARGEST NUMBER IS: ");
        if((a>=b)&&(a>=c)){
            System.out.println(a);
        }
        else if(b>=c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

    }
}
