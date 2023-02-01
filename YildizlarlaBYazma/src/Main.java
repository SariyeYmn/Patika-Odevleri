
public class Main {
	public static void main(String[] args) {
		
		String[][] harf = new String[7][4];
		
		for(int i = 0; i<harf.length ; i++) {
			for(int j=0 ; j<harf[i].length ; j++) {
				
				if((i == 0 || i== 3 || i==6) && (j<harf[i].length)){
					System.out.print("*");
				}
					
				else if((j == 0 || j==3) && (i<harf.length) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
