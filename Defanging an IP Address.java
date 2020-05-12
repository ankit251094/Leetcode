class Solution {
    public String defangIPaddr(String address) {
        
         String str=null;
	    //String [] str1=new String[(address.length())*2];
	    
	    str=address.replaceAll("\\.","[.]");
		
		//System.out.println("Str"+str);
		return str;
    }
}