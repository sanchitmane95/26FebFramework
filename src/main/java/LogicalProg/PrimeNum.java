package LogicalProg;

public class PrimeNum {
	public static void main(String[] args) {
		
		int num =783;
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		    if(count==1)
		    {
		    	System.out.println("Not Prime");
		    }
		    else
		    {
		    	System.out.println("Prime");
		    }
	}
	}
	
