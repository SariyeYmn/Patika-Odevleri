import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double amount ;
		double kdv;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen hesaplanacak tutarı giriniz:");
		amount = sc.nextDouble();
		
		if(amount>=0 && amount<1000) {
			kdv = amount*18/100;  
		}
		else {
			kdv = amount*8/10;
		}
		
		System.out.println("*************");
		System.out.println("KDV'siz tutar:" + amount);
		System.out.println("KDV'li tutar:" + (amount + kdv));
		System.out.println("KDV tutarı :" + kdv);
	}
}
