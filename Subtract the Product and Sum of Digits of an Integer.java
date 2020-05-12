class Solution {
    public int subtractProductAndSum(int n) {
        
        	 int digit=0;
		 int result=0;
		 int sum=0;
		 int product=1;
		 ArrayList<Integer> al=new ArrayList<Integer>();
		 
		 while(n>0)
		 {
			 digit=n%10;
			 al.add(digit);
			 n=n/10;
			 
		 }
	        
		 //System.out.println("AL"+al);
		 
		for(int i=0;i<al.size();i++)
		{
			sum=sum+al.get(i);
			product=product*al.get(i);
		}
		
		result=product-sum;
		return result;
    }
}