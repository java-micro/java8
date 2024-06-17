package javastreams.steam;

public class MaxSubArray {
	
	
	
	public static int maxSubArray(int [] nums) {
		
		int sum =0;
		int max = nums[0];
		int start = -1;
		int end = -1;
		int starti = 0;
		
		
		for(int i =0;i<nums.length;i++)
			
		{
			
			
			
			if(sum==0)
			{
				starti = i; 
			}
			sum = sum + nums[i];
			
			if(sum>max)
			{
				max = sum;
				start = starti;
				end = i;
			}	
				
				if(sum<0)
					sum = 0;
		}
		
		System.out.print("The subarray is: [");
		for(int j =start;j<=end;j++)
		{
			System.out.print(nums[j]+" ");
		}
		System.out.print("] ");
		
		
		return max;
		
	}

}
