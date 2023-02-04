import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen sicaklik giriniz:");
		double h = sc.nextDouble();
		if(h<5) {
			System.out.println("Kayak yapabilirsiniz.");
		}
		else if(h>=5 && h<=15) {
			System.out.println("Sinemaya gidebilirsiniz.");
		}
		else if(h>15 && h<=25) {
			System.out.println("Pikniğe gidebilirsiniz.");
			
		}
		else {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}
	}

}
