package javastreams.steam;

public class SortedArray {
	
	
	
	public static boolean sortArray(int [] nums, int n) {
		
		
		for(int i=1;i<n;i++)
		{
			
			if(nums[i-1] > nums[i])
			{
				return false;
			}
			
		}
		
		return true;
	}

}
