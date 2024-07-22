package Pack1;

public class largeNum4 {
	public static void main(String[] args) {
		int a=500;
	    int b=5000;
	    int c=600;
	    int d=6000;
	    
	    if (a>b)
	    {
	    	if (a>c)
	    	{
	    		if (a>d)
	    		{
	    			System.out.println("a is large");
	    		}
	    		else
	    		{
	    			System.out.println("d is large");
	    		}
	    	}
	    	else
	    	{
	    		if (c>d)
	    		{
	    		
	    			System.out.println("c is large");
	    		}
	    			else
	    			{
	    				System.out.println("d is large");
	    			}
	    		}
	    	
	    }
	    else
	    {
	    	if (b>c)
	    	{
	    		if (b>d)
	    		{
	    			System.out.println("b is large");
	    		}
	    		else
	    		{
	    			System.out.println("d is large");
	    		}
	    	}
	    	else
	    	{
	    		if (c>d)
	    		{
	    			System.out.println("c is large");
	    		}
	    		else
	    		{
	    			System.out.println("d is large");
	    		}
	    	}
	    }
	}

}
