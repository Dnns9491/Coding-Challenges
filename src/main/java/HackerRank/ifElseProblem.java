package HackerRank;
/*
Task
Given an integer, n, perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird

Input format
A single line containing a positive integer, n.

Constraints
1 <= n <= 100
 */

import java.util.Scanner;

public class ifElseProblem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N % 2 == 1){
            System.out.println("Weird");
        } else if (N>=2 && N <=5) {
            System.out.println("Not Weird");
        } else if (N>=6 && N <=20) {
            System.out.println("Weird");
        } else if (N > 20) {
            System.out.println("Not weird");
        } else {
            System.out.println("undefined");
        }
    }
}

/*
The reason we don't declare the scanner method within the main method, is because
1. If another method in the class has to use Scanner, it can be reused.
2. Avoids creating multiple Scanner objects unnecessarily.
3. If declared inside the main method, it only exists withing the main() and can't be used elsewhere.
 */