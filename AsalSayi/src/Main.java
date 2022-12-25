import java.util.Scanner;

public class Main {
	
	public static  int  isPrime(int num,int i) {
		
		if(i==1) 
			return 1;
		
		
		else if(num % i == 0) 
			return 0;
				
				
		else 
	        return isPrime(num,i-1);
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pozitif bir sayi giriniz:");
		int num=scan.nextInt();
		
		int prime = isPrime(num,num/2);
		
		if(prime==1) {
			
			System.out.println(num +" " + "Asaldır...");
		}
		else
			System.out.println(num +" " + "Asal değildir...");
		
		

	}

}
