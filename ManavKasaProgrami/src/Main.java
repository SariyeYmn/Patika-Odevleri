import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		String[] urunler = {"Armut","Elma","Domates","Muz","Patlıcan"};
		double[] miktar=new double[5];
		double[] fiyatlar= {2.14,3.67,1.11,0.95,5.00};
		double toplam=0;
		System.out.println("----------------------------Fiyatlar------------------------");
		System.out.println(" Armut : 2,14 TL\r\n"
				+ " Elma : 3,67 TL\r\n"
				+ " Domates : 1,11 TL\r\n"
				+ " Muz: 0,95 TL\r\n"
				+ " Patlıcan : 5,00 TL");
		
		for(int i=0;i<urunler.length;i++) {
			System.out.println(urunler[i] + " kaç kg aldınız:");
			miktar[i]=sc.nextDouble();
			toplam +=miktar[i]*fiyatlar[i];
		}
		System.out.println("Toplam tutar:" + toplam);
		
		
		
	}

}
