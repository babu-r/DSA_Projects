/*
* Array Rotaion using Loops.
* Alternate solution using Queues: https://github.com/sb255/Data-Structures/blob/master/Queues/StringRotation.java 
*/

public class ArrayRotation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int r = sc.nextInt();
		arrayRotate(arr, n, r);
	}
	public static void arrayRotate(int arr[], int n, int r) {
		int arr2[] = new int[n];
		if(r < n) {
			r = r % n;
			
			for(int i=0; i<n; i++) {
				arr2[i] = arr[(i + n - r) % n ];
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i] + " ");
		}
	}
}