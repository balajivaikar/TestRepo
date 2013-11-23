package org.bvr.test.test;

public class FindMaxNumber {

	public static void main(String[] args) {
		FindMaxNumber maxNumber = new FindMaxNumber();
		int max = maxNumber.getMaxNumber();
		System.out.println("MAX Value = " + max);
	}

	public int getMaxNumber() {
		int[] unsortedArray = {3,100,7,1009,54,123,2,1,5};
//		int intMax = Integer.MAX_VALUE;
		int max = 0;
		int maxIndex = -1;
		for(int i=0;i<unsortedArray.length;i++) {
			if(unsortedArray[i]>max) {
				max=unsortedArray[i];
				maxIndex = i;
			}
		}
		System.out.println("MAX Value = " + max + "\t indexed@ " + maxIndex);
		return max;
	}
}
