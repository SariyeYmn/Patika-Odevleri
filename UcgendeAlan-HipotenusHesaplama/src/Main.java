import java.util.Scanner;

public class Main {
	public static double hipotenusBul(int k1,int k2) {
		return Math.sqrt((k1*k1)+(k2*k2));
	}
	
	public static double ucgenAlan(int k1,int k2,int k3 ) {
		double cevre = (k1+k2+k3);
		double u = cevre/2;
		
		return Math.sqrt(u*(u-k1)*(u-k2)*(u-k3));
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  k1,k2,a,b,c;
		
		System.out.println("1-Dik ücgenin hipotenüsünü bulma\n2-Üçgenin alanını hesaplama ");
		System.out.println("Yapmak istediğiniz işlemi seciniz:");
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.println("Üçgenin dik kenarlarını giriniz\n" + "Birinci kenar:");
			k1=sc.nextInt();
			System.out.println("İkinci kenar:");
			k2=sc.nextInt();
			System.out.println("Üçgenin hipotenüsü:" + hipotenusBul(k1,k2));
		}
		else {
			System.out.println("Üçgenin kenarlarını giriniz.\n" +"Birinci kenar:" );
			a=sc.nextInt();
			System.out.println("İkinci kenar:");
			b=sc.nextInt();
			System.out.println("Üçüncü kenar:");
			c=sc.nextInt();
			System.out.println("Üçgenin alana:" + ucgenAlan(a,b,c));
			
		}
	}
	
	

}
