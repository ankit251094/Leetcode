class Solution {
    public List<String> fizzBuzz(int n) {
        
         ArrayList<String> l=new ArrayList<String>();
        for(int i=1;i<=n;i++)
        {
           if (i%3==0 && i%5!=0)
           {
               l.add("Fizz");
           }
            else if(i%5==0 && i%3!=0)
                
            {
                l.add("Buzz");
                
            }
            
            else if (i%5==0 && i%3==0)
            {
                l.add("FizzBuzz");
            }
            else
            {
                l.add(Integer.toString(i));
            }
        }
        
        for(int i=0;i<n;i++)
        {
        	System.out.println("List"+i+" "+l.get(i));
        }
         return l;
    }
    
   
}