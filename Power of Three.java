class Solution {
    public boolean isPowerOfThree(int n) {
        	//int count=0;
		
		if(n>0)
        {
		while(n%3==0)
		{
			n=n/3;
			//count++;
		}
		
		//System.out.println("Val is"+count);
		if(n==1)
		{
			return true;
		}
		
        }
		return false;
    }
}