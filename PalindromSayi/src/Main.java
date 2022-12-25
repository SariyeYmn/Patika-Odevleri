import java.util.Scanner;

public class Main {
	
	static void isPalindrom(int number) {
		
		int temp=number , reverse=0 , lastNumb=0;
		while(temp != 0) {
			
			lastNumb = temp % 10;
			reverse = (reverse*10) + lastNumb;
			temp /=10;
			
		}
		
		if(number == reverse) {
			
			System.out.println("Palindrom sayıdır...");
		}
		
		else
			System.out.println("Palindrom sayı degildir...");
	}

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kontrol etmek isteginiz sayiyi giriniz:");
		int number = scan.nextInt();
		
		isPalindrom(number);
		
		
		

	}

}
