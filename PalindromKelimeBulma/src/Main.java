import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String vocabulary , reserve = "";
		System.out.println("Lütfen bir kelime giriniz:");
		vocabulary = sc.next();
		
		for(int i = vocabulary.length()-1;i >=0 ;i--) {
			 reserve += vocabulary.charAt(i);
			}
		
		if(reserve.equals(vocabulary)) {
			
			System.out.println(vocabulary + " kelimesi palindromdur...");
		}
		
		else {
			System.out.println(vocabulary + " kelimesi palindrom değildir...");
		}
	}

}
