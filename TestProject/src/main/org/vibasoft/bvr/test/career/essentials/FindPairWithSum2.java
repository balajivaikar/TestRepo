package org.vibasoft.bvr.test.career.essentials;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindPairWithSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSum(new int[]{10,100,0,30,50,70},100));
	}

	public static Map<Integer, Integer> hasSum(int[] numbers, int sum) {
//		int retVal = -1;
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		Set<Integer> setNumbers = new HashSet<Integer>();
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>sum)
				continue;
			int requiredNumber = sum-numbers[i]; 
			if(setNumbers.contains(requiredNumber)) {
				System.out.printf("numberOne=%d,\tnumberTwo=%d\n",numbers[i],requiredNumber);
				map.put(numbers[i], requiredNumber);
//				return true;
			}
			else {
				setNumbers.add(numbers[i]);
			}
		}
		return map;
	}
}
