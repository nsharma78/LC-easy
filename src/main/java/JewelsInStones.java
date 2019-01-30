/*
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.

 */

package main.java;



public class JewelsInStones {

	public static void main(String []args){
		System.out.println("No. of jevwels: " + numJewelsInStones("aA", "aAAbbbb"));
		System.out.println("No. of jevwels: " + numJewelsInStones1("z", "ZZ"));
	}

	public static int numJewelsInStones(String J, String S) { // O(S+J), O(128)

		int count = 0;
		int[] arr = new int[128];

		for(char c : S.toCharArray())
			arr[c - '0']++;

		for(char c : J.toCharArray())
			count = count + arr[c - '0'];

		return count;
	}

	public static int numJewelsInStones1(String J, String S) { // O(S*J) O(1)

		int count = 0;

		for (int i = 0 ; i < S.length(); ++i){
			if(J.indexOf(S.charAt(i)) > -1)
				count++;
		}

		return count;
	}
}
