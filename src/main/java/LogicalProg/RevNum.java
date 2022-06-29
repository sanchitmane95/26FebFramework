package LogicalProg;

public class RevNum {

	public static void main(String[] args) {
		int num =12345;
		String strNum = Integer.toString(num);	
//		String str ="HarryPotter";
		String strRev ="";
		char ch;
		for(int i=strNum.length()-1; i>=0; i--)
		{
			ch=strNum.charAt(i);
			strRev=strRev +ch;
		}
		System.out.println("String Reverse = " +strRev);

	}

}
