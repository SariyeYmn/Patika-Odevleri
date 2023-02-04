import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=0,b=0,c=0;
		double[] numbers = new double[3];
		
		for(int i=0;i<3;i++) {
			System.out.println( i+1  +". sayiyi giriniz");
			numbers[i]=sc.nextDouble();
		}
		a=numbers[0];
		b=numbers[1];
		c=numbers[2];
		if(a>b && a>c) {
			if(b>c) {
				System.out.println("a>b>c");
				System.out.println("Büyükten küçüge sıralaması:" + a +" " + b + " " + c );
			}
			else {
				System.out.println("a>c>b");
				System.out.println("Büyükten küçüge sıralaması:" + a +" " + c + " " + b );
				
			}
		}
		else if(b>a && b>c) {
			if(a>c) {
				System.out.println("b>a>c");
				System.out.println("Büyükten küçüge sıralaması:" + b +" " + a + " " + c );
			}
			else {
				System.out.println("b>c>a");
				System.out.println("Büyükten küçüge sıralaması:" + b +" " + c + " " + a );
				
			}
			
		}
		else {
			if(a>b) {
				System.out.println("c>a>b");
				System.out.println("Büyükten küçüge sıralaması:" + c +" " + a + " " + b );
			}
			else {
				System.out.println("c>b>a");
				System.out.println("Büyükten küçüge sıralaması:" + c +" " + b + " " + a );
				
			}
		}
		
	
	}

}
