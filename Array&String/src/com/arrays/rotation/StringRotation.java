package com.arrays.rotation;

public class StringRotation {

	public static boolean isSubString(String s1,String s2,int len1,int len2)
	{
		if(len1==0)	return false;
		if(len2==0)	return true;
		
		if(s1.toCharArray()[len1-1] == s2.toCharArray()[len2-1])
		{
			System.out.println(s1.toCharArray()[len1-1]);
			return isSubString(s1, s2, len1-1, len2-1);
		}
			
		return isSubString(s1, s2,len1-1,len2);
	}
	
	public static boolean isRotation(String s1, String s2)
	{
		int len = s1.length();
		if(len == s2.length() && len > 0)
		{
			String s1s1 = s1 + s1;
			return isSubString(s1s1,s2,s1s1.length(),s2.length());
		}
		return false;
	}
	
	public static void main(String[] args) {
		
//		System.out.println("enter A string: ");
//		Scanner sc =  new Scanner(System.in);
//		String s1 = sc.nextLine();
//		System.out.println("enter another string:");
//		String s2 = sc.nextLine();

		if(isSubString("akash", "ash", 5, 3))
			System.out.println("S2 is substring of s1");
		if(isRotation("akash", "sajjs"))
			System.out.println("String s2 is s1's rotation.");
		else
			System.out.println("Not a rotation");
	}

}
