import java.util.Scanner;

public class Main {
	
	static int  plus (int sayi1,int sayi2) {
		return sayi1+sayi2;	
	}
	
	static int  minus(int sayi1,int sayi2) {
		return sayi1-sayi2;
		
	}
	
	static int times(int sayi1,int sayi2) {
		return sayi1*sayi2;
		
	}
	
	static int divided(int sayi1,int sayi2) {
		return sayi1/sayi2;
		
	}
	
	static void power(int sayi1,int sayi2) {
		int sonuc=1;
		
		while(sayi2!=0) {
			sonuc*=sayi1;
			--sayi2;
		}
				
		
		System.out.println(sonuc);
	}
	static int  factorial(int sayi1) {
		int faktoriyel=1;
		
		for(int i=1;i<=sayi1;i++) {
			faktoriyel*=i;
		}
		
		
		return faktoriyel;

	}
	static int mod(int sayi1,int sayi2) {
		return sayi1%sayi2;
		
	}
	static int rectangularArea(int sayi1,int sayi2) {
		 
		return sayi1*sayi2;
		
	}
	static int rectangularPerimeter(int sayi1,int sayi2) {
		return 2*(sayi1+sayi2);
		
	}
	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		String menü="1-Toplama işlemi \n" 
				+ "2-Çıkarma işlemi \n"
				+ "3-Çarpma İşlemi \n"
				+ "4-Bölme İşlemi \n"
				+ "5-Üslü sayı hesaplama \n"
				+ "6-Faktoriyel hesaplama \n"
				+ "7-Mod alma \n"
				+ "8-Dikdörtgen alan \n"
				+ "9-Dikdörtgen çevre \n"
				+ "10-Sistemden çıkış...\n";
		
		System.out.println(menü);
		System.out.println("Yapmak istediginiz işlemi seciniz:");
		int secim = scan.nextInt();
		
		System.out.println("Birinci sayıyı giriniz:");
		int sayi1=scan.nextInt();
		System.out.println("İkinci sayıyı giriniz:");
		int sayi2=scan.nextInt();
		
	
		
		switch(secim) {
		
		case 1:
			System.out.println(plus(sayi1,sayi2));
			break;
		case 2:
			System.out.println(minus(sayi1,sayi2));
			break;
		case 3:
			System.out.println(times(sayi1,sayi2));
			break;
		case 4:
			System.out.println(divided(sayi1,sayi2));;
			break;
		case 5:
			power(sayi1,sayi2);
			break;
		case 6:
			System.out.print("Birinci sayinin faktöriyeli:");
			System.out.println(factorial(sayi1));
			System.out.print("İkinci sayinin faktöriyeli:");
			System.out.println(factorial(sayi2));
			break;
		case 7:
			System.out.println(mod(sayi1,sayi2));
			break;
		case 8:
			System.out.println(rectangularArea(sayi1,sayi2));
			break;
		case 9:
			System.out.println(rectangularPerimeter(sayi1,sayi2));;
			break;
		case 10:
			System.out.println("Sistemden çıkış yapılıyor...");
			break;
		default:
			System.out.println("Hatalı seçim yaptınız... tekrar deneyin");
		}
		
		
		
	}

}
