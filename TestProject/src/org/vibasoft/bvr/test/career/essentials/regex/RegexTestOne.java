package org.vibasoft.bvr.test.career.essentials.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestOne {

//	String patternStr = "^[a-zA-Z][a-zA-Z0-9._-]{2,17}[^._-]$";
	String patternStr = "^[a-zA-Z][a-zA-Z0-9._-]{0,15}[a-zA-Z0-9]$";
	Pattern pattern;
	Matcher matcher;
	
	RegexTestOne() {
		System.out.println("RegexTestOne.RegexTestOne() called");
		pattern = Pattern.compile(patternStr);
	}
	
	public boolean validateUserName(String userName) {
		matcher = pattern.matcher(userName);
		boolean validUserName = matcher.find();
		System.out.println("Matching count = " + matcher.groupCount());
		int i = 0;
		while(i < matcher.groupCount()) {
			System.out.println("Match: " + matcher.group(i));
		}
		
		return validUserName;
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegexTestOne test = new RegexTestOne();
		System.out.println(test.validateUserName("John123"));
	}*/

}
