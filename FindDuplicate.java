class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet();
	int dups=0;
	for(int num: nums)
	{
		if(!set.contains(num))
		{
			set.add(num);
		}
		else
		{
			dups=num;
		}
	}
	System.out.println("Duplicate:-"+dups);
	return dups;
    }
}