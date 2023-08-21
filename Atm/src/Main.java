
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = " 1. İşlem : Bakiye Sorgulama\n "
                        + "2. İşlem : Para Çekme\n "
                        + "3. İşlem : Para Yatırma\n "
                        + "Çıkış yapmak için q'a basınız. ";
        
        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("******************************");
        
        while (true) {
        
            System.out.println("Yapmak istediğiniz işlemi seçiniz. : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Çıkış yapılıyor...");
                break;
                
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + bakiye);
            }
            
            else if (islem.equals("2")){
                System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                if (tutar > bakiye) {
                    System.out.println("Yeterli bakiyeniz bulunmamaktadir. Bakiyeniz : " + bakiye);
                }
                else{
                  bakiye -= tutar;
                    System.out.println("Paranız çekilmiştir. Yeni bakiyeniz : " + bakiye);
                    
                }
                
                  
            }
            
            
            else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                bakiye += tutar;
                System.out.println("Paranız yatırılmıştır. Yani bakiyeniz : " + bakiye);
                
            }
            
            
            else {
                System.out.println("Geçersiz işlem seçtiniz.");
            }
        }
        
        
        
        
    }
    

    
}
