class Solution {
    public int countPrimes(int n) {
        		ArrayList<Integer> al=new ArrayList<Integer>();
		//ArrayList<Integer> al2=new ArrayList<Integer>();
		
		for(int i=2;i<n;i++)
		{
			boolean flag=true;
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			
			if(flag==true)
			{
				al.add(i);
			}
		}
		
		for(int a:al)
		{
			System.out.println(a);
		}
		return al.size();
    }
}