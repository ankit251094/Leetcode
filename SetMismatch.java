class Solution {
    public int[] findErrorNums(int[] nums) {
       
	//public int[] findErrorNums(int[] nums) {
	HashSet<Integer> set=new HashSet();
	int dups=0;
	int[] dup_array=new int[2];
	Arrays.sort(nums);
	for(int num: nums)
	{
		if(!set.contains(num))
		{
			set.add(num);
		}
		else
		{
			dups=num;		
			System.out.println("Dups"+dups);
		}
	}
	
	int size=nums.length;
	int temp=0;
	for(int i=1;i<=size;i++)
	{
		if(!set.contains(i))
		{
			temp=i;
			System.out.println("Temp:"+temp);
		}
	}
	
	dup_array[0]=dups;
	dup_array[1]=temp;
	for(int i=0;i<dup_array.length;i++)
	{
		System.out.println("Duplicate:-"+dup_array[i]);	
	}
	//System.out.println("Duplicate:-"+dup_array);
	return dup_array;
    }
}