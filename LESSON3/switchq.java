package LESSON3;

public class switchq {
    public static void main(String[] args) {
        int number=2;
        switch (number) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("mango shake");
                break;
            default:
                System.out.println("we were dreaming");
                break;
            //CASE ORDER IS NOT NECESSARY
            //IF NONE OF THE CASES ARE RIGHT , DEFAULT IS PRINTED
        }
    }
}
