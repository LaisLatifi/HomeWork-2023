package projectHomeWork1;

public class HW2 {
    public static void main(String[] args) {
        /*
        . Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array.
         */
        int[] box={1,3,5,7,9};
        int sum=0;
        for (int i = 0; i <box.length ; i++) {
            sum=sum+box[i];

        }
        System.out.println(sum);


    }
}
