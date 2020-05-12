class Solution {
    public int missingNumber(int[] nums) {
   Arrays.sort(nums);
	int miss=0;
	HashSet<Integer> set=new HashSet<Integer>();
	
	for(int num:nums)
	{
		set.add(num);
	}
	System.out.println("Set"+set);
	
	int count=nums.length;
	for(int i=0;i<=count;i++)
	{
		if(!set.contains(i))
		{
			miss=i;
		}
	}
	
	System.out.println("Miss:-"+miss);
	
	return miss;
}}