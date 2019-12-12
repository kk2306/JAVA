package com.arrays.unique;

public class Unique {

	public static boolean isUnique(String str)
	{
		if(str.length()>128) return false;
		boolean[] char_set = new boolean[128];
		
		for(int i=0; i<str.length(); i++)
		{
			int val = str.charAt(i);
			if(char_set[val])		//already found this char in str
				return false;
			char_set[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {

		String str = "aksh oni";
		System.out.println(isUnique(str));

	}

}
