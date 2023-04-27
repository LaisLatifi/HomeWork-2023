package homework;

import javax.swing.*;
import java.util.Scanner;

public class season1 {
    public static void main(String[] args) {

       /* Write a program for user to enter his/hers birth month. Based on the month define the season.
                Example: if user is born in March, April, May → season =”Spring”
        if user is born in June, July, August →
        season =”Summer”  etc …
        At the end of the program we should see 1 output as “You were born is season __”*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("what is your birth month");
        String month= scanner.next();
        if (month.equals("March"));
        {
            System.out.println("Speing");
            if (month.equals("April"));
            {
                System.out.println("Spring");
            }
        }



    }
}
