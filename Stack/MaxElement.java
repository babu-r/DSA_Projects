/*
You have an empty sequence, and you will be given  queries. Each query is one of these three types:

1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.
Function Description

Complete the getMax function in the editor below.

getMax has the following parameters:
- string operations[n]: operations as strings

Returns
- int[]: the answers to each type 3 query

Input Format

The first line of input contains an integer, . The next  lines each contain an above mentioned query.

Constraints

Constraints
1<=n<=10^5
1<=x<=10^9
1<=type<=3


All queries are valid.

Sample Input

STDIN   Function
-----   --------
10      operations[] size n = 10
1 97    operations = ['1 97', '2', '1 20', ....]
2
1 20
2
1 26
1 20
2
3
1 91
3
Sample Output

26
91

*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {
    public static void main(String arg[]) {
 
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int input = sc.nextInt();
            switch (input){
                case 1:
                    int x = sc.nextInt();
                    stack.push(x);
                    if(maxStack.isEmpty() || x >= maxStack.peek()) {
                        maxStack.push(x);
                    }
                    break;
 
                case 2:
                    int popVl = stack.pop();
                    if(popVl == maxStack.peek()) {
                        maxStack.pop();
                    }
                    break;
 
                case 3:
                    System.out.println(maxStack.peek());
                    break;
 
                default: break;
            }
        }
        sc.close();
    }
}

