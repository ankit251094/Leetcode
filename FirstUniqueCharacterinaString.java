class Solution {
    public int firstUniqChar(String s) {
        	 char [] c=new char[s.length()];
		 int index=0;
		
		 HashSet<Character> set=new HashSet<>();
		 HashSet<Character> set1=new HashSet<>();
		 HashSet<Character> set2=new HashSet<>();
		 HashMap<Character,Integer> map=new HashMap<>();
		 
		 if(s.isEmpty())
		 {
			 return -1;
		 }
		 int count=1;
		 for(int i=0;i<c.length;i++)
		 {
			 c[i]=s.charAt(i);
			 if(!(set.contains(c[i])))
			 {
				 set.add(c[i]);
			 }
			 
			 else
			 {
				 set1.add(c[i]);
			 }
			 
			 
		 }
		 
		 set.removeAll(set1);
		 System.out.println("  "+set);
		 System.out.println(set1);
		 if(set.isEmpty())
		 {
			 if(!(set1.isEmpty()))
				 return-1;
				 
			 
		 }
		 
		 for(int k=0;k<s.length();k++)
		 {
			 if(set.contains(c[k]))
			 {
				 index=k;
				 break;
			 }
		 
		 }
		 return index;
    }
}