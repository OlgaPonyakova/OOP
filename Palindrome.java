

public class Palindrome {
	public static void main(String[] args) {
		 
		for (int i = 0; i < args.length; i++) {
			 String s = args[i];
			 System.out.println(s);
			 System.out.println(isPalindrome(s));
			 System.out.println("\n");
			}
		 	
		}

	public static String reverseString(String s) //функция для изменения последовательности символов
	{
		String str="";
		for (int i=s.length()-1; i>=0;i--) {
			str+=s.charAt(i);
		}
		return(str);
	}
	
	
	public static boolean isPalindrome(String s) //функция для сравнения строк
	{
		if(s.equals(reverseString(s)))
		{
			return (true);
		}
		else {
			return (false);
		}
	}
}
