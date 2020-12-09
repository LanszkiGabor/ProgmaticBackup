package _1102_Rekurzió;

import java.util.Stack;

public class Rekurzio {
    public static void main(String[] args) {
        System.out.println(calcFibonacci(10));
        System.out.println(calcFiboIterative(10));

    }

    public static long calcFiboIterative(int nr){
        long prev = 0;
        long prev2 = 1;
        long act = 0;
        for (int i = 0; i < nr; i++) {
            act = prev2 + prev;
            prev2 = prev;
            prev = act;
        }
        return act;
    }

    public static int calcFibonacci(int nr){
        if(nr == 0){
            return 0;
        }
        if(nr == 1){
            return 1;
        }
        return calcFibonacci(nr - 1) + calcFibonacci(nr -2);
    }

    public static long getNFibonacciRecursiveUsingStack(long number) {
        Stack<Long> fibo = new Stack<>();
        fibo.push(number);
        long result = 0;
        while (fibo.size() != 0) {
            if (fibo.peek() == 0) {
                fibo.pop();
            } else if (fibo.peek() == 1) {
                result += fibo.peek();
                fibo.pop();
            } else {
                long nr = fibo.peek();
                fibo.pop();
                fibo.push(nr - 1);
                fibo.push(nr - 2);
            }
        }
        return result;
    }




}
