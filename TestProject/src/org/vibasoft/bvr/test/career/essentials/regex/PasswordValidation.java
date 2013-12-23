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
// in pattern ()? is optional
//	String patternStr = "^[a-zA-Z](?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]){5,14}";
//	String patternStr = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]){6,15}";
	String patternStr = "(?=[a-zA-Z]*[0-9])(?=[a-z0-9]*[A-Z])(?=[A-Z0-9]*[a-z]){6,15}";
	Pattern pattern;
	Matcher matcher;
	
	PasswordValidation() {
		System.out.println("RegexTestTwo.RegexTestTwo() called");
		pattern = Pattern.compile(patternStr);
	}
	
	public boolean validatePassword(String password) {
		System.out.printf("Password=%s\t",password);
		matcher = pattern.matcher(password);
//		boolean validPassword = matcher.find();
		boolean validPassword = false;
		System.out.print("Matching count = " + matcher.groupCount() + "\t");
		int i = 0;
//		while(i < matcher.groupCount()) {
		while(matcher.find()) {
			System.out.printf("Match: start index=%d\tend index=%d\tgroup=%s\n",matcher.start(),matcher.end(), matcher.group(i));
//			i++;
			validPassword = true;
		}
		
		return validPassword;
	}
	
	public void resetMatcher() {
		matcher.reset();
	}
	
}
