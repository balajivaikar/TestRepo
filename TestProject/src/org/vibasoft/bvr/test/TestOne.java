package org.vibasoft.bvr.test;

import java.util.*;

public class TestOne {
	char[] chars = {'c','a','r','b','o','n'};
	List<String> formedString = new ArrayList<String>();
	StringBuilder builder = new StringBuilder();
	
	public void generatePossibleStrings() {
		for(int i=0;i<chars.length;i++) {
			//builder.replace(0,builder.length()-1,"");
			builder.setLength(0);
			for(int k=0;k<chars.length;k++) {
				//if(!builder.contains(chars[k]))
				if(builder.indexOf(Character.toString(chars[k])) == -1)
				//if(builder.indexOf(chars[k])!=-1)
					builder.append(chars[k]);
			}
			formedString.add(builder.toString());
		}		
		
		//printing generated strings
		for(String str : formedString) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		TestOne test = new TestOne();
		test.generatePossibleStrings();
	}
}