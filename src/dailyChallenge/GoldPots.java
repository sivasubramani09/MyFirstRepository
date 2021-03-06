package dailyChallenge;

import java.util.Scanner;

/*
 Gold Pots Unit Digit

A series of N gold pot is found by a man. He starts picking the gold coins from the first pot.
He moves forward by the unit digit value of the count of gold coins in the current pot and picks 
up the next pot. This is continued until there are no more pots at the unit digit position from 
the current pot. The number of gold coins in each pot is given as input. The program must print 
the total gold coins collected.

Boundary Condition(s):
2 <= N <= 1000

Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).

Output Format:
The first line contains the total number of gold coins collected.

Example Input/Output 1:

Input:
7
452 231 871 943 25 762 823 

Output:
3089

Explanation:
Gold pots are collected in the following order 452, 871, 943 and 823.

Example Input/Output 2:

Input:
5
91 42 72 194 32

Output:
327

Explanation:
Gold pots are collected in the following order 91, 42 and 194.
 * */
public class GoldPots {
	public static void main(String[] args) {
		System.out.println("Enter the no. of Gold Pots: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//Length of the array
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();	//For getting array input
		}
		sc.close();
		int sum =0;
		for(int j=0;j<n;) {
			sum += arr[j];
			j = j+(arr[j]%10);
		}
		System.out.println("Total Gold Coins Collected: "+sum);
	}
}
