package practice;

public class T2 {
    public static void main(String[] args) {
        String[] names = {"ab", "ac", "ad", "ae", "af"};
        // System.out.println(names[2]);
       // for (int i = 0; i <= 4; i++) {// manually
          //  System.out.println(names[i]);
        for (int i = 0; i <names.length-1 ; i++) {//-1 remove one element from last
           System.out.println(names[i]);

            //ways two
            int counter=0;
            while(counter<names.length){
                System.out.println(names[counter]+" ");
                counter++;
            }
        }


        }
    }


