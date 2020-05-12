class Solution {
    public int[] sortedSquares(int[] A) {
        
        	ArrayList<Integer>  al=new ArrayList<Integer>();
		 int[] final_arr=new int[A.length];
		 for (int i=0;i<A.length;i++)
		 {
			 al.add(A[i]*A[i]);
		 }
	        
		 Collections.sort(al);
		 for(int j=0;j<final_arr.length;j++)
		 {
			 final_arr[j]=al.get(j);
			 System.out.println("Final Array:"+final_arr[j]);
		 }
		 
		 return final_arr;
    }
}