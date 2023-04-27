package projectHomeWork1;

public class HW3 {
    public static void main(String[] args) {

        /*
        Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.
         */


        int [][] number={{1,6,5},
                {10,15,20}
        };
        for (int[] numb : number) {
            for (int i : numb) {
                if( i %2==0){
                    System.out.println(i);
                }
            }
        }

    }
}




