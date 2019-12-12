package com.arrays.urlify;

public class URLifyString {

	public static String replaceSpaces(String str) {
		int trueLen = str.length(), spaceCount=0, i=0;
		String strRe = "";
		strRe = str.replace(" ", "%20");
		return strRe;
	}
	
	public static void main(String[] args) {

		String str = "Mr Akash Soni  ";
		System.out.println(replaceSpaces(str.trim()));

	}

}
