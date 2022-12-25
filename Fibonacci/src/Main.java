import java.util.Scanner;

public class Main {
	
	
	 public static int fibonacci(int number) {
		 if(number==0)
			 return 0;
		 if(number==1 || number==2)
			 return 1;
		 
		 else 
			 return fibonacci(number-2)+fibonacci(number-1);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fibonacci dizisinde maksimum kaç sayı olsun");
		
		int max = scan.nextInt();
	
		System.out.print("İstenilen Fibonacci Serisi ");
		for(int i = 0; i < max; i++){
				System.out.print(fibonacci(i) +" ");
			}
		

	}

}
