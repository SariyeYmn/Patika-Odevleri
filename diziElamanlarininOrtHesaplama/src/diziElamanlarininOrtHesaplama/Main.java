package diziElamanlarininOrtHesaplama;

public class Main {
	
	public static void main(String[] args) {
		int[] numbers = {12,13,25,50,100,150,250};
		int num = 0;
		
		for(int i:numbers) {
			num += i;	
		}
		
		System.out.println("Dizi elemanlarının ortalaması:" + (num/numbers.length));
	}
	

}
