package LESSON4;
//continue keyword
//printing all numbers from 0 to 5 except 3
public class cont {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
