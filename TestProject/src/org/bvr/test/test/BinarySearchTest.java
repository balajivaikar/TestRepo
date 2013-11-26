package org.bvr.test.test;

/*
 * Assumptions: Passed array will be already sorted
 */
public class BinarySearchTest {

	int[] sortedArray = {25,35,85,100,200,500,525,555,595};
	/*
	 * This returns index of the searched item
	 */
	public int search(int startIndex, int endIndex, int searchValue) {
		System.out.printf("In Search method\tStart Index=%d,End Index=%d, Search Value=%d\n",startIndex,endIndex, searchValue);
		assert (endIndex <=sortedArray.length);
//		for(int i=startIndex; i<endIndex+1; i++) {
			int median = ((endIndex - startIndex)/2)+startIndex;
			if(sortedArray[median] == searchValue) {
				return median;
			}
			else if(sortedArray[median] < searchValue) {
				return search(median,endIndex, searchValue);
				
			} 
			else if(sortedArray[median] > searchValue) {
				return search(startIndex,median,searchValue);
			}  
//		}
		return -1;	
	}
	
	public static void main(String[] args) {
		BinarySearchTest test = new BinarySearchTest();
		System.out.println("Search index = " + test.search(0,9,610));
		
	}

}
