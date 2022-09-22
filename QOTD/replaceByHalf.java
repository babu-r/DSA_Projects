/*Replace by half (QOTD)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are N integers written on a black board. You can perform the following operation if and only if all the integers on the board are even.
Choose any one of the integers from the board. Let it be x. Replace x by x/2.
Find the maximum number of operations you can perform.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Find the maximum number of operations you can perform.
Example
Sample Input:
3
8 12 40

Sample Output:
5*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void replaceHalf(int[] arr) {
        int n = arr.length;
        int max;

        for(int i=0; i<n; i++) {
            
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        replaceHalf(arr);
    }
}