package HackerRank;
/*
Task
In this challenge, you must read  integers from stdin and then print them to stdout.
Each integer must be printed on a new line.

Input Format
There are 3 lines of input, and each line contains a single integer.

Sample Input
42
100
125
*/

import java.util.Scanner;

public class stdInStdOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        long b = scan.nextLong();
        scan.nextLine();
        String c = scan.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
