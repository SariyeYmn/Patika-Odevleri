import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sbt=10 ;
		double  yol,toplam=0;
		
		System.out.println("Gidilen km  yi giriniz:");
		yol=sc.nextDouble();
		toplam=10+(yol*2.20);
		
		if(yol>0) {
			if(toplam<=20) {
				System.out.println("Ödenecek miktar :20" );
			}
			else {
				System.out.println("Ödenecek miktar:" + toplam );
			}
			
			
		}
		
		else{
			System.out.println("Hatalı tuslama yaptınız...");
		}
		
		
	}

}
