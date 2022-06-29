package LogicalProg;

public class PalindromeString {

	public static void main(String[] args) {
		String str ="madam";
		String strOri =str;
		String strRev = " ";
		char ch;
		
		for(int i =0; i<str.length();i++)
		{
			ch =str.charAt(i);
			strRev = ch + strRev;
		}
		System.out.println("Orignal string = " +strOri);
		System.out.println("Reverse string = " +strRev);
		
		if(strOri.equals(strRev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("palindrome");
		}
		
		

	}

}
