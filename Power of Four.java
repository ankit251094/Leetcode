class Solution {
    public boolean isPowerOfFour(int num) {
        int n=num;
          if(n>0)
        {
        while(n%4==0)
		{
			n=n/4;
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