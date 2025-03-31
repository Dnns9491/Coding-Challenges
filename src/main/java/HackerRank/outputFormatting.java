package HackerRank;

/*/
Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 90.

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100
cpp            065
python         050
================================
 */

import java.util.Scanner;

public class outputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i=0; i < 3; i++) {
            String s = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-14s %03d%n", s, x);
            /*/
            🧩 Format Breakdown:
1. %-14s
%s = placeholder for a String
14 = make it 14 characters wide
- = left-align the string (spaces go to the right)
🔹 If s = "Name", it becomes: "Name         " (10 spaces padded)

2. %03d
%d = placeholder for an int
03 = pad with zeros to 3 digits
🔹 If x = 7, it becomes: 007
             */
        }
        System.out.println("================================");
    }

}
