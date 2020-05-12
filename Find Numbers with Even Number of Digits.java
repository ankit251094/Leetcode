class Solution {
    public int findNumbers(int[] nums) {
        
        int digit=0;
	
	ArrayList<Integer>al =new ArrayList<Integer>();
	for(int i=0;i<nums.length;i++)
	{
		int count=0;
		int temp=0;
		while(nums[i]>0)
		{
			digit=nums[i]%10;
			nums[i]=nums[i]/10;
			count++;
		}
		
		if(count%2==0)
		{
			al.add(nums[i]);
		}
	}
	
	
	
	
	
	return al.size();
    }
}