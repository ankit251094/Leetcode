class Solution {
    public boolean isUgly(int num) {
        
        if (num==0 )
		 {
			 return false;
		 }
		 
         while(num%2==0)
		 {
			 num/=2;
			 //count2++;
		 }
		 
		 while(num%3==0)
		 {
			 num/=3;
			 //count3++;
		 }
		 
		 while(num%5==0)
		 {
			 num/=5;
			 //count5++;
		 }
		 
		 System.out.println("Num is"+num);
		if(num!=1)
		{
			return false;
		}
		 
	return true;
    }
}