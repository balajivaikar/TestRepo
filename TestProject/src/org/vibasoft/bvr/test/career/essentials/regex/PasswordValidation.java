/*
 * PasswordValidation.java
 * @author: Balaji V
 * @date: 19-Dec-2013
 */
package org.vibasoft.bvr.test.career.essentials.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
 * Below are the criteria to validate given password
 * Must contain a digit from 0-9
 * Must contain one uppercase character
 * Must contain one lowercase character
 * Length must be between 6 to 15 characters long 
 */
public class PasswordValidation {

	String patternStr = "^[a-zA-Z0-9]{6,15}";
	Pattern pattern;
	Matcher matcher;
	
	PasswordValidation() {
		System.out.println("RegexTestTwo.RegexTestTwo() called");
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
		RegexTestTwo test = new RegexTestTwo();
		System.out.println(test.validateUserName("John123"));
	}*/

}
