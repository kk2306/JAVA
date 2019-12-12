package com.arrays.unique;

public class UniqueBit {
	
	public static boolean isUnique(String str) {
		int checker = 0;
		for(int i=0;i<str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if((checker & (1<<val)) > 0)
				return false;
			checker = checker | (1<<val);
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str = "aksha oni";
		System.out.println(isUnique(str));

	}

}
