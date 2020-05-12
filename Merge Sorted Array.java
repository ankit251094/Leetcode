class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        for(int i=0;i<m;i++)
        {
            al.add(nums1[i]);
        }
        
         for(int i=0;i<n;i++)
        {
            al.add(nums2[i]);
        }
        
        Collections.sort(al);
        
        
        for(int j=0;j<nums1.length;j++)
        {
            nums1[j]=al.get(j);
        }
        
        //return nums1;
    
    }
}