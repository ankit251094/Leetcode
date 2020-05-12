class Solution {
    public int numJewelsInStones(String J, String S) {
      	int index=0;
		int index1=0;
		char[] J_arr=new char[J.length()];
		for(int i=0;i<J.length();i++)
		{
			J_arr[i]=J.charAt(index++);
		}
		
		char[] S_arr=new char[S.length()];
		for(int i=0;i<S.length();i++)
		{
			S_arr[i]=S.charAt(index1++);
		}
        
		
		
		int count=0;
		for (int i=0;i<S_arr.length;i++)
		{
			for (int j=0;j<J_arr.length;j++)
			{
				if(S_arr[i]==J_arr[j])
				{
					count++;
				}
			}
		}
		
		//System.out.println("Count"+count);
        return count;  
        
        
    }
}