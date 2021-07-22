package com.org;

public class Sample {
public static void main(String[] args) {
	String s ="java";
	System.out.println(s.length());
    String s1="";
	char[] cs = s.toCharArray();
	for (char c : cs) {
		if(c=='a') {
			s1+=s1+c;
		}
		System.out.println(s1);
	}
}
}
