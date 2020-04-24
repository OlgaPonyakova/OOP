
public class Primes {
	public static void main(String[] args) {
		for (int i=2; i<=100;i++) {
			if (isPrime(i)==true) {
				System.out.println(i);
			}
		}
	   
	}
	public static boolean isPrime(int n) //функция проверки
	{
		int k=0;
		boolean t = false;
		for (int i=2; i<=n;i++) {
			if (n%i==0) {
				k++;
			}
		}
		if(k==1) {
			t=true;
		}
		return t;
		
	}
}
