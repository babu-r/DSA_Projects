Shifting Queries
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton is given a string of length N. Further his friend Alice gave him a challenge and gave Q queries to him.

Now Newton has to process each of the queries correctly. The queries are described as below. Each query consists of 2 integers:
1) 1 A: In this type of query, Newton has to right shift the string 'A' times.
2) 2 A: In this type of query, Newton has to tell Alice the Ath character of the string.

(One right shift of string "newton" would look like "nnewto")

Note: The string will change according to each query.
Input
The first line of the input would consist of 2 integers, N and Q
The next Q line represent Q queries. The ith of which contains 2 integers - Ti Ai

Constraints:
2 <= N <= 7x10^5
1 <= Q <= 7x10^5
1 <= Ai <= N
Ti = {1, 2}
S consists of lowercase English letters.
Output
For each query of type "2 A", print the answer in a single new line.
Example
Sample Input 1:
6 3
newton
2 2
1 1
2 2

Sample Output 1:
e
n