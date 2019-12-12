package com.arrays.compression;

public class StringCompression {

	public static String compress(String s)
	{
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for(int i=0; i<s.length(); i++)
		{
			countConsecutive++;
			//Next char is is different than current, append this char to result
			if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1) ) {
				compressed.append(s.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.length() < s.length() ? compressed.toString() : s;
	}
	
	public static void main(String[] args) {
		
		String s="tyyyyuuu";
		System.out.println(compress(s));

	}

}
