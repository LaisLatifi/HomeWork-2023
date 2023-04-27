package Class7;

public class HW3 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)
        // if number is divided by 2 and the remainder id 0 it is an even
        //if the number is divided by 2 and the reminder isn't 0 it is and ODD number

        int num = 20;
        while (num >= 1 && num % 2 == 0) {
            System.out.println(num+" ");
            num -= 2;

        }
        for (int i=20; i>=1; i-=2 ){
            System.out.print(i+" ");

        }

    }
}