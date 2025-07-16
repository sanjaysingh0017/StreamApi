package org.example.Section8;

import java.util.List;

public class Problem11ContainsPrimeNumber {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,18);
        boolean anyMatch = list.stream().anyMatch(n -> isPrime(n));
        System.out.println(anyMatch);
    }

    private static boolean isPrime(int number) {
        if( number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if( number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
