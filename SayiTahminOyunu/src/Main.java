import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		String s = ("HELLOOO\n" + "Oyunda toplamda 5 kere hata yapma hakkınız vardır" +
		"hata hakkınız bitmeden önce sistemin belirlediği sayıyı tahmin ederseniz oyunu kazanırsınız... " );
		
		Scanner sc= new Scanner(System.in);
		
		int rand = (int) (Math.random()*99+1);
		System.out.println(rand);
		
		int right=0;
		int reply;
		
		while(right<=5) {
			System.out.println("Lütfen 0-100 sayıları arasından tahmininizi giriniz:");
			reply = sc.nextInt();
			
			if (reply>=0 && reply<=100) {
				if(reply == rand) {
					System.out.println("Tahmininiz dogrudur.Oyunu kazandınız...");
					break;
				}
				else {
					if(right<5) {
						System.out.println("Tahmininiz yanlıştır tekrar deneyiniz...");
						right++;	
					}
					
					else {
						System.out.println("Hata yapma hakkınız bitmiştir oyunu kaybettiniz...");
						break;
					}
						
				}
			}
			
			else {
				System.out.println("Hatalı tuşlama yaptınız ");
				right++;
				break;
			}	
		}
	}

}
