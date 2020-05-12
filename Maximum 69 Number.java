class Solution {
    public int maximum69Number (int num) {
        int rem=0;
		String str=Integer.toString(num);
		int size=str.length();
		int [] arr=new int[size];
		int count=size-1;
		//int new_rem=0;
		while(num>0)
		{
			rem=num%10;
			arr[count--]=rem;
			num=num/10;
		}
		
		//String s2="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==6)
			{
				arr[i]=9;
				break;
			}
		}
		
		String s2="";
		for(int a:arr)
		{
			s2=s2+Integer.toString(a);
		}
		 
		//System.out.println("s2 is"+s2);
		
		int result =Integer.valueOf(s2);
		return result;
    }
}