import java.util.ArrayList;
import java.util.Collection;

public class RevrseAwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="i am selenium";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			rev=ch+rev;
		}
	//	System.out.println(rev);
		//muineles ma i
		
		char[] ch = s.toCharArray();
		char[] c=new char[s.length()];

	//	System.out.println(ch);

		if(s.length()==rev.length())
		{
			for(int i=0;i<c.length;i++)
			{
			if(i==1 && i==3)
				{
				     c[i]=' ';
 				}
				else
				{
					c[i]=rev.charAt(i);
 
				}
			
			}
			
			
		
		}
// 		for(int i=0;i<c.length;i++)
//		{
//			System.out.print(c[i]);
//		}
// 		
	  System.out.println(c);
	  
	  String s1=new String (c);
	// System.out.println(s1.trim());
	  String[] s2=s1.split(" ");
		for(int i=0;i<s2.length+2;i++)
		{
			System.out.println();
			 
		}
			
	}
		
  }
