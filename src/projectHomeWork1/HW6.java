package projectHomeWork1;

public class HW6 {
    public static void main(String[] args) {
        //Write a java program to check whether a given
        //number is prime or not?

        int number=9;
        int count=0;

        for (int i = 1; i <=number ; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count==2){// because prime number are only divided by 1 or themselves.
            System.out.println("Number is Prime");
        }else {
            System.out.println("Number is not Prime");
        }

    }
}


