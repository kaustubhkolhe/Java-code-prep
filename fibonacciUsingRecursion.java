/*
Question: Nth fibonacci number using Recursion
 */

class Main {
    public static void main(String[] args) {

        System.out.println(fibo(6));

    }

    private static long fibo(int n) {
        if(n<=1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

}