public class Solution {

	public int[] twoSum(int[] nums, int target) {
		
		int size=nums.length;
		int sum=0;
		int[] arr=new int[2];
		
		for (int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				sum=nums[i]+nums[j];	
			
				if (target ==sum)
				{
					arr[0]=i;
					arr[1]=j;
				}
			}
		}
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("i"+i+"arr[i]"+arr[i]);
		}
		return arr;         
	}
    
}