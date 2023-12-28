package lesson9;

import java.util.stream.IntStream;

public class Fibonacci {

    public static void main(String[] args) {
        int fibNumber = 5;
        int[] fib = {0, 1};


        int result = IntStream.range(2, fibNumber)
                .mapToObj(i -> {
                    int temp = fib[0] + fib[1];
                    fib[0] = fib[1];
                    fib[1] = temp;
                    return temp;
                })
                .reduce((a, b) -> fib[1])
                .orElse(fibNumber <= 1 ? fibNumber : fib[1]);

        System.out.println("Fibonacci number at position " + fibNumber + " equals " + result);
    }


}



