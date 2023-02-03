import java.util.Scanner;

public class Main {
	public static double daireAlan(double r) {
		return Math.PI*r*r;
	}
	
	public static double daireAlan(double r,double a) {
		return Math.PI*r*r*a/360;
	}
	
    public static double daireCevre(double r) {
    	return 2*Math.PI*r;
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double r1,r2,r3,a;
		
		System.out.println("1-Bir dairenin alanını hesaplama\n"
				+ "2-Bir daire diliminin alanını hesaplama\n"
				+ "3-Bir dairenin çevresini hesaplama");
		System.out.println("Yapmak istediginiz işlemi seciniz:");
		int select = sc.nextInt();
		
		if(select==1) {
			System.out.println("Dairenin yarıçapını giriniz:");
			r1=sc.nextDouble();
			System.out.println("Dairenin alanı:" + daireAlan(r1));
			
		}
		else if(select==2) {
			System.out.println("Daire diliminin yarıçapını giriniz:");
			r2=sc.nextDouble();
			System.out.println("Daire diliminin merkez açısının ölçüsünü giriniz:");
			a=sc.nextDouble();
			System.out.println("Daire diliminin alanı:" + daireAlan(r2,a));
			
		}
		else if(select==3) {
			System.out.println("Dairenin yarıçapını giriniz:");
			r3=sc.nextDouble();
			System.out.println("Dairenin çevresi:" + daireCevre(r3));
			
		}
		else {
			System.out.println("Hatalı tuşlama yaptınız.");
		}
		
	}

}
