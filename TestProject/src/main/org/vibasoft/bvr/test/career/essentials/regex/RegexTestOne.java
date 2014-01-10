package org.vibasoft.bvr.test.career.essentials.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestOne {

//	String patternStr = "^[a-zA-Z][a-zA-Z0-9._-]{2,17}[^._-]$";
//	String patternStr = "^[a-zA-Z][a-zA-Z0-9._-]{0,15}[a-zA-Z0-9]$";
	String patternStr = "^[a-zA-Z][a-zA-Z0-9._-]{0,15}[^._-]$";
	Pattern pattern;
	Matcher matcher;
	
	RegexTestOne() {
		System.out.println("RegexTestOne.RegexTestOne() called");
		pattern = Pattern.compile(patternStr);
	}
	
	public boolean validateUserName(String userName) {
		System.out.printf("Username=%s\t",userName);
		matcher = pattern.matcher(userName);
//		boolean validUserName = matcher.find();
		boolean validUserName = false;
		System.out.print("Matching count = " + matcher.groupCount() + "\t");
		int i = 0;
//		while(i < matcher.groupCount()) {
		while(matcher.find()) {
			System.out.printf("Match: start index=%d\tend index=%d\tgroup=%s\n",matcher.start(),matcher.end(), matcher.group(i));
			validUserName=true;
		}
		
		return validUserName;
	}
	
	public void resetMatcher() {
		matcher.reset();
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegexTestOne test = new RegexTestOne();
		System.out.println(test.validateUserName("John123"));
	}*/

}
