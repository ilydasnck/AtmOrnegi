import java.util.Scanner;

public class AtmOrnegi {
	public static void main(String[] args) {
		
		String sifre="ilayda23";
		double bakiye=0;
		Scanner input= new Scanner(System.in); 
		
		System.out.println("Bankamıza hoş geldiniz. Şifrenizi girin:");
		String sifreDeneme = input.next();
		

			for (int j = 0; j < 4; j++) {
				if (sifre.equals(sifreDeneme)) {
					System.out.println("Giriş başarılı. Hoşgeldiniz");
					break;

				}
				else {
					System.out.println("Hatalı giriş tekrar deneyiniz");
					sifreDeneme = input.next();
				}
				

			}
			if(sifre.equals(sifreDeneme)==false) {
				System.out.println("Giriş başarısız");
				System.exit(1);
				
			}
		
		while(true) {
			System.out.println("Yapacağınız işlemi seçin:\n"+"1- Bakiye sorgulama\n"+"2- Para Yatırma\n"+"3- Para çekme\n"+"4- Kart iade");
			int secim=input.nextInt();
			
			switch (secim) {
			case 1: {
				System.out.println("Bakiyeniz: "+ bakiye);
				break;
			}
			
			case 2:{
				System.out.println("Ne kadar para yatırmak istiyorsunuz: ");
				double paraEkleme=input.nextDouble();
				bakiye=bakiye+paraEkleme;
				System.out.println("Para ekleme başarıyla tamamlandı");
				break;
			}
				
			case 3:{
				System.out.println("Çekeceğiniz para miktarını giriniz: ");
				double paraCekme= input.nextDouble();
				if(paraCekme>bakiye) {
					System.out.println("Yetersiz bakiye");
				}
				else {
					bakiye=bakiye-paraCekme;
				}
				
				break;
			}
			case 4:{
				System.out.println("Kartınız iade ediliyor");
				System.exit(1);
			}
		
			
			default:
				
				System.out.println("Geçerli giriş giriniz:");
				
			}//switch
			
			
			
			System.out.println("Başka işlem yapmak ister misiniz (e/h)");
			String devamMiTamamMi=input.next();
			if(devamMiTamamMi.equalsIgnoreCase("h")) {
				System.out.println("Kartınızı alınız..");
				break;
				
			}
			
		}//while
	}//main
}//class
