class Solution {
    public int reverse(int x) {
       int result=0;
		//Stack stack=new Stack();
		
		
		
			int remainder=0;
			String rev="";
			int val=0;
			if(x>0)
			{
				val=x;
				rev="";
			}
			
			else if(x<0)
			{
				val=x;
				val=val*(-1);
				rev="-";
			}
			else if(x==0)
			{
				rev="0";
			}
			while(val>0)
			{
				remainder=val%10;
				System.out.println(remainder);
				val=val/10;
				System.out.println(val);
				rev=rev+remainder;
			}
			long r=0;
		
			try
			{
				result=Integer.parseInt(rev);
				System.out.println("Reverse is"+result);
				return result;
				
			}
			
			catch(NumberFormatException nfe)
			{
				//r=Long.parseLong(rev);
				//System.out.println("Reverse is"+r);
				return 0;
			}
    }
}