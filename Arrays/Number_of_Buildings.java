/*
Problem Statement : 
There are N buildings in a row with different heights H[i] (1 <= i <= N).
You are viewing the buildings from the left and you can see the roof of a building i if no building to the left of the ith building has a height greater than the ith building.
You are asked to find the number of buildings whose roofs you can see.
Input
The first line contains N denoting number of buildings.
The next line contains N space seperated integers denoting heights of the buildings from left to right.


Constraints
1 <= N <= 100000
1 <= H[i] <= 1000000000000000
Output
The output should contain one integer which is the number of buildings whose roofs you can see.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int buld=sc.nextInt();
			int a[]=new int[buld];
			for(int i=0;i<buld;i++){
				a[i]=sc.nextInt();
			}
			//Arrays.sort()
			int count=1;
			int max=a[0];
			for(int i=1;i<buld;i++){
				
					if(max<a[i]){
						count++;
						max=a[i];
					}
			}
      System.out.print(count);
		}
	}
}