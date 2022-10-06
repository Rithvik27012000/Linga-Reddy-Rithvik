package org.createaccount;


public class NewUser {

	
	public static void main(String[] args) {
	
		String s = "Hello world";
		String s1 ="hello world";
		         // 012345678910
		
		//length of the String
		
		int length = s.length();
		System.out.println(length);
		System.out.println("Branch 2 making changes");
		
		//To upper case
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		//To lower case
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		//Equals
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
		//Equal ignore
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		
		//Index of
		int indexOf = s.indexOf('l');
		System.out.println(indexOf);
		
		//Last index of
		int lastIndexOf = s.lastIndexOf('l');
		System.out.println(lastIndexOf);
		
		//CharAt
		char charAt = s.charAt(0);
		System.out.println(charAt);
		
		//Contains
		boolean contains = s.contains("Hel");
		System.out.println(contains);
		
		//Replace
		String replace = s.replace("Hello", "Hi");
		System.out.println(replace);
		
		//Replaceall
		String replaceAll = s.replaceAll("l" , "*");
		System.out.println(replaceAll);
		
		//Starts with
		boolean startsWith = s.startsWith("He");
		System.out.println(startsWith);
		
		//Endswith
		boolean endsWith = s.endsWith("ld");
		System.out.println(endsWith);
		
		//Isempty
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		//Trim
		String trim = s.trim();
		System.out.println(trim);
		
		//Substring
		String substring = s.substring(4);
		System.out.println(substring);
		
		//Subsquence
		CharSequence subSequence = s.subSequence(3, 8);
		System.out.println(subSequence);
		
		//Substring2
		String substring2 = s.substring(3, 8);
		System.out.println(substring2);
		
		//Compareto
		//it will compare the ascii value of the 2 strings and gives you the ascii differents  between the 2 string
		int compareTo = s.compareTo(s1);
		System.out.println(compareTo);
		
		
	}
	}
