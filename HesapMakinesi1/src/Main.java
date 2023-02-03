import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1,n2,select;
	
		System.out.println("Birinci sayiyi giriniz:");
		n1=sc.nextInt();
		System.out.println("İkinci sayiyi giriniz:");
		n2=sc.nextInt();
		System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
		System.out.println("Yapmak istediğiniz işlemi seçiniz:");
		select = sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("Toplam:" + (n1+n2));
			break;
		case 2:
			System.out.println("Çıkarma:" + (n1-n2));
			break;
		case 3:
			System.out.println("Çarpım:" + (n1*n2));
			break;
		case 4:
			if(n2!=0) {
			System.out.println("Bölüm:" + (n1/n2));}
			else {
			System.out.println("Bir sayi 0 a bölünemez.");
			}
			break;
		default:
			System.out.println("Hatalı tuşlama yaptınız.Tekrar deneyiniz.");
		}
	}

}
