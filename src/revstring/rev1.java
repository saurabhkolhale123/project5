package revstring;

public class rev1 {
	
	public static void main(String[] args) {
	
		
		String name="mom";  
		String rev="";
		
		for(int i=2;i>=0;i--)   //3   2>=0   3-1=2-1  0>=0   1-1=0
			
		{
		rev =rev +name.charAt(i);   //logic  //3  2  1
			//"" +d  =d + c=   dc+b=dcb +a  =   dcba
		
		}
		
		System.out.println(rev);
		
		
		
		
		
	}
	
	
	
	
	

}
