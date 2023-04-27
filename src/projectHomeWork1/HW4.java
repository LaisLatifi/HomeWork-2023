package projectHomeWork1;

public class HW4 {
    public static void main(String[] args) {
        int[][] number = {{1, 6, 5},//36 even
                {10, 15, 20}//21
        };
        int evensum = 0;
        int oddsum = 0;
        for (int[] numb : number) {
            for (int i : numb) {
                if (i % 2 == 0) {
                    evensum+=i;
                }
                else if (i % 2 != 0)
                    oddsum+=i;
            }
        }
        System.out.println("The sum of even number is" + evensum);
        System.out.println("The sum of odd number is" + oddsum);
    }
}

