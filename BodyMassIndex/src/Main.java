import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 double boy ,kilo ;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Lütfen(metre cinsinden) boyunuzu giriniz:");
	     boy = sc.nextDouble();
	     System.out.println("Lütfen kilonuzu(kg cinsinden) giriniz:");
	     kilo = sc.nextDouble();
	     
	     System.out.println("Vücut Kitle İndeksiniz:" + (kilo/boy*boy));
	}

}
