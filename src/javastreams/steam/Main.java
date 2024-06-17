package javastreams.steam;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	
public static void main(String[] args) {
	
	
	// Count frequency of characters in string	
	FrequencyCount.frequencycounter("dineshsaini");
	
	
	System.out.println("****find-the-element-with-highest-occurrences-in-an-array-java***");
	
	
	List<String> inputlist = Arrays.asList("pen", "pencil", "pen", "pen", "eraser ", "pencil");
	
	
	MaxCountStream.maxCount(inputlist);
	
	
	System.out.println("****sum of max sub array***");
	int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
	
	 System.out.println(MaxSubArray.maxSubArray(arr));


	 
	 int[] nums = {1,2,6,4,5};
	 System.out.println("****Sorted array***");
	 
	System.out.println(SortedArray.sortArray(nums, nums.length));
}

}
