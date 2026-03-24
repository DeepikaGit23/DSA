package general;

import java.util.ArrayList;

public class Fibonacci {
    static  int counter = 5;
    static int a=0,b=1;
    public static void main(String[] args) {
        System.out.println(fibo(counter));
        fibWithRecursion(a,b);
        System.out.println("fib num :" + findFibNumber(6));
    }

    public static ArrayList<Integer> fibo(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0, b = 1, newFinoNumber = 0;
        list.add(a);
        list.add(b);

        for (int i = 0; i <= n; i++) {
            newFinoNumber = a + b;
            a = b;
            b = newFinoNumber;
            list.add(newFinoNumber);
        }
        return list;
    }

    public static void fibWithRecursion(int a, int b) {
        if(counter>0)
        {
             int fibNumber = a + b;
             a = b;
             b = fibNumber;
            System.out.println(fibNumber);
            counter--;
            fibWithRecursion(a, b);
        }
        else {
            return;
        }
    }

    public static int findFibNumber(int n) {
        if(n<=1)
        {
            return n;
        }
        else {
            return findFibNumber(n-1) + findFibNumber(n-2);
        }
    }
}