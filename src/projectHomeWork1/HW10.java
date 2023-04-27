package projectHomeWork1;

public class HW10 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from
        //an Array of Strings?

        String arr[]={"java","c++","c","python","java"};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("found the duplicate element:"+arr[i]);
                }

            }

        }



    }
}
