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
/*
To Note!
The main reason we use primitives like int and long instead of Integer and Long is memory efficiency and performance. (even though they both work)

Use primitives (int, long, double, etc.) when:
You don't need null values.
You are performing fast calculations or loops.
You want to save memory in large datasets.

Use wrapper classes (Integer, Long, etc.) when:
You need to store values in Collections (like List<Integer> or Map<Long, String>).
You need null values (primitives can't be null, but Long can).
You need to use methods like Integer.parseInt(), Long.toString(), etc.

Use primitives by default, unless you're working with Collections or need an Object.
 */
