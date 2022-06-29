package LogicalProg;

public class ArmstromgNum {

	public static void main(String[] args) {
		
		int num =371, rem,sum=0;
		int num1=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num = num/10;
		}
		if(num==sum)
		{
			System.out.println("Give number is Armstrong number");
		}
		else
		{
			System.out.println("Give number is not Armstrong number");
		}
	

	}

}
