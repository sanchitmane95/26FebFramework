package LogicalProg;

public class Factorial {

	public static void main(String[] args) {
	//5!=5*4*3*2*1 = 120 =1*2*3*4*5 = 120
		int num =5 ,fact=1;
		for(int i=1;i<=num;i++)
		{
			fact =fact*i;
		}
		System.out.println("factorial =" +fact);

	}

}
