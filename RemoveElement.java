class Solution {
    public int removeElement(int[] nums, int val) {
          int count=0;
		 //int size=0;
		 int temp=0;
		 
		 
		 
		 //size=nums.length-count;
		 //int [] arr=new int[size];
		 //int max=nums.length-1;
		 
		 for(int i=0;i<nums.length;i++)
		 {
			 if(nums[i]!=val)
			 {
				 count++;
			 }
		 }
		 for(int i=0;i<nums.length;i++)
		 {
			 for(int j=i+1;j<nums.length;j++)
			 {
				 if(nums[i]==val)
				 {
					 temp=nums[i];
					 nums[i]=nums[j];
					 nums[j]=temp; 
				 }
				  
			 }
			 
		 }
		 
		 System.out.println("count"+count);
		//size=nums.length-count;
		 
		 for(int i=0;i<count;i++)
		 {
			 System.out.println(nums[i]);
		 }
		 
		 return count;
		 
    }
}