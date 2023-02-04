import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		String userName1="sariye", password1="metallica";
		String userName,password,ps;
		
		System.out.println("Lütfen kullanıcı adınızı giriniz:");
		userName = sc.nextLine();
		System.out.println("Lütfen şifrenizi giriniz:");
		password = sc.nextLine();
		
		if(userName.equals(userName1) && password.equals(password1)) {
			System.out.println("Giriş yapıldı...");
		}
		else if(userName.equals(userName1) && !(password.equals(password1))) {
			System.out.println("Şifreniz yanlış...");
			System.out.println("Şifrenizi sıfırlamak ister misiniz?");
			String select = sc.nextLine();
			if(select.equalsIgnoreCase("evet")) {
				System.out.println("Yeni şifre:");
				ps=sc.nextLine();
				if(ps.equals(password1)) {
					System.out.println("Şifre oluşturulamadı lütfen başka şifre giriniz.");
				}
				else {
					System.out.println("Şifre oluşturuldu");
				}
			}
			else {
				System.out.println("Tekrar deneyiniz.");
			}
			
		}
		else {
			System.out.println("Giriş bilgileriniz hatalı lütfen tekrar deneyiniz...");
		
		}	
	}
}
