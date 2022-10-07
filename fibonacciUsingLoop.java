/*
Question: Nth fibonacci number using loop
 */

class Main {
    public static void main(String[] args) {

        System.out.println(fibo(8));

    }

    private static long fibo(int n) {

        long num1 = 0, num2 = 1;

        for (int i = 0; i < n; ++i) {


            long sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }
        return num1;
    }
}
