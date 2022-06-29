package LogicalProg;

public class RevString {

	public static void main(String[] args) {

		String str ="HarryPotter";
		String strRev ="";
		char ch;
		for(int i=str.length()-1; i>=0; i--)
		{
			ch=str.charAt(i);    //r e t
			strRev=strRev +ch;
		}
		System.out.println("String Reverse = " +strRev);

	}


	}


