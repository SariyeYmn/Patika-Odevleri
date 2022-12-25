import java.util.Scanner;

public class Main {
	
	static int üsAlma(int taban,int kuvvet) {
		if(kuvvet==0)
			return 1;
		else if(taban==1)
			return 1;
		else
			return taban*üsAlma(taban,kuvvet-1);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz:");
		int sayi1=scan.nextInt();
		System.out.println("İkinci sayiyi giriniz:");
		int sayi2=scan.nextInt();
		
		System.out.println(üsAlma(sayi1,sayi2));

	}

}
