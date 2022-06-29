package LogicalProg;

public class RevNum1 {

	public static void main(String[] args) {
		int num=12345;
		int RevNum=0;
		int multifactor =10000;
		System.out.println("Orignal Number =" +num);
		for(int i=0;i<5;i++)
		{
			int temp = num%10;
			num = num/10;
			RevNum = RevNum + temp*multifactor;
			multifactor = multifactor /10;
		}
		System.out.println("Reverse Number =" +RevNum);	
	}

}
