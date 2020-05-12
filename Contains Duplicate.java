class Solution {
    public boolean containsDuplicate(int[] nums) {
   
	boolean flag=false;
	Set<Integer> set=new HashSet<>(nums.length);
	
	for(int x:nums)
	{
		if(set.contains(x))
		{
			flag=true;
		}
		set.add(x);
	}
	
    return flag;
        
    }
}