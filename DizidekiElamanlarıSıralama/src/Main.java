import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int n,a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Dizinin boyutu ne kadar olsun?");
		n=scan.nextInt();
		int[] numbers = new int[n];
		
		for(int i=0 ;i<n;i++ ) {
			System.out.print("Dizinin " + (i+1) +".elemanı:");
			a = scan.nextInt();
			numbers[i] = a;
			System.out.print("\n");
		}
		
		
		System.out.print("Sıralama:");
		Arrays.sort(numbers);
		for(int i:numbers) {
			System.out.print(i + " ");
		}
		
		
	}
}
