import java.io.*;

public class Amstrong 

{
	
	public static void main (String[] args) 
	
	{
        	 
		 int no = 54748,  originalNo, count = 0;
        	  int n = no,   result=0;
        	  int remainder;
        	   while(n > 0)
    	   	   {
			n = n/10;
	  	     	count++;
        	   }
		originalNo = no;
		while(originalNo!=0)
		{
			remainder = originalNo % 10;	result += Math.pow(remainder,count);
			 originalNo = originalNo/10;
		}
        	if(result==no)
			  System.out.println(no+" is an Amstrong Number");
		else
			System.out.println(no+" is not an Amstrong Number");
	}

}
