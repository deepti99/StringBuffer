
public class StringbufferDelete {

	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("University");  
		sb.delete(1,3);  
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("University"); 
		sb1.delete(4,7);  
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer("University"); 
		sb2.delete(3,5);  
		System.out.println(sb2);
		
		}  
		
}

