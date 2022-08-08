/*
Is this repeated? (Contest)
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of N integers, find whether there exists three consecutive same integers in the array.
Input
The first line of the input contains an integer N.
The second line contains N space separated integers of the array A.

Constraints
3 <= N <= 1000
1 <= A[i] <= 100
Output
Output "Yes" if there exists three consecutive equal integers in the array, else output "No" (without quotes).
Example
Sample Input
5
1 2 2 2 4

Sample Output
Yes

Explanation: The segment [2, 2, 2] follows the criterion.

Sample Input
5
1 2 2 3 4

Sample Output
No

*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_num = sc.nextInt();

		int[] num = new int[total_num];

		for (int i=0; i< total_num; i++) {
			num[i] = sc.nextInt();
		}
		/*for (int i=0; i< total_num; i++) {
			System.out.println(num[i]);
		}*/
		int count = 0;
		for (int i=0; i< total_num-1; i++) {
			if(num[i] == num[i + 1]) {
				count++;
				System.out.println(num[i]);
			}
		}

		if (count >= 2) {
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}