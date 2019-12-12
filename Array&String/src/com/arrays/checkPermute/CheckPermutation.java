package com.arrays.checkPermute;

public class CheckPermutation {

	public static boolean permutation(String s1, String s2)
	{
		if(s1.length() != s2.length())
			return false;
		int[] letters = new int[128];		//Assuming ASCII chars
		char[] chars = s1.toCharArray();
		for(char c: chars)					//count each char in s1
			letters[c]++;
		for(int i=0; i<s2.length(); i++) {
			int c = s2.charAt(i);
			letters[c]--;
			if(letters[c]<0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String s1 = "akash soni";
		String s2 = "shkaasoni ";
		System.out.println(permutation(s1, s2));

	}

}
