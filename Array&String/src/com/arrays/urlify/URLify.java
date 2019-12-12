package com.arrays.urlify;

public class URLify {

	public static String replaceSpaces(char[] str, int trueLen)
	{
		
		int spaceCount=0,index,i=0;
		for(;i<trueLen;i++) {
			if(str[i]==' ')
				spaceCount++;
		}
		index = trueLen + spaceCount*2;
		char[] finalStr = new char[index];
//		if(trueLen < str.length)
//			str[trueLen] = '\0';			//ending array in case of access spaces
		for(i=trueLen-1;i>=0;i--) {
			if(str[i] == ' ') {
				finalStr[index-1] = '0';
				finalStr[index-2] = '2';
				finalStr[index-3] = '%';
				index = index-3;
			}else {
				finalStr[index-1] = str[i];
				index--;
			}
		}
		return String.valueOf(finalStr);
	}
	
	public static void main(String[] args) {
		
		String str = "Mr Krishna Kumar  ";
		String trimStr=str.trim();
		System.out.println(replaceSpaces(trimStr.toCharArray(), trimStr.length()));

	}

}
