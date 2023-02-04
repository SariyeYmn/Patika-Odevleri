import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] dersler= {"Matematik","Fizik","Türkçe","Kimya","Müzik"};
		double[] notlar = new double[5]; 
		double toplam=0,ort;
		
		for(int i=0;i<dersler.length;i++) {
			System.out.println(dersler[i] + " ders notunuzu giriniz:");
			notlar[i]=sc.nextDouble();
			if(notlar[i]>=0 && notlar[i]<=100) {
				toplam +=notlar[i];
			}
			
		}
		ort = toplam / dersler.length;
		
		if(ort>=50) {
			System.out.println("Sınıfı geçtiniz...");
			System.out.println("Ortalamanız:" + ort);
		}
		
		else {
			System.out.println("Sınıfta kaldınız...");
			System.out.println("Ortalamanız:" + ort);
		}
		
	}

}
