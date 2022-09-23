/*
Question: Given a sorted integer array n number x find all pairs  whose sum is given number x.
    Array [-8, -6, -4, 0, 1, 2,3,5,6,7, 10, 15, 20]
    X=1
*/
// will work for unsorted array too.

import java.util.HashSet;

class Main {
    public static void main(String[] args)
    {
        int[] Array = {-8,-6,-4,0,1,2,3,5,6,7,10,15,20};
        int sum = 1;
        pairOfSum(Array,sum );
    }

    static void pairOfSum(int[] arr, int sum)
    {
        HashSet<Integer> hSet = new HashSet<>();

        for (int num1 : arr) {
            int num2 = sum - num1;


            if (hSet.contains(num2)) {
                System.out.println(num1 + " and " + num2);
            }
            // adding num1 to set after condition check to avoid repeation of number.
            hSet.add(num1);
        }
    }
}


