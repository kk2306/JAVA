package com.arrays.palindromePermute;


public class PalindromePermutation {
	
	public static boolean isPalindrome(String phrase)
	{
		boolean foundOdd = false;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for(char c : phrase.toCharArray())
		{
			int x = getCharValue(c);
			if(x != -1)
				table[x]++;
		}
		for(int count : table)
		{
			if(count % 2 == 1)
			{
				if(foundOdd)
				{
					return false;
				}
				foundOdd=true;
			}
		}
		return true;
	}

	public static int getCharValue(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if(a <= val && z >= val)
			return val-a;
		return -1;
	}
	
	public static void main(String[] args) {
		
		String s = "naanmm";
		System.out.println(isPalindrome(s));

	}

}
