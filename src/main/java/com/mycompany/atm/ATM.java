   import java.util.Scanner;
public class ATM {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double bakiye = 10000;
      double tutar;
      
      int secim ;
      int islemsayisi=0;
     double topyat=0;
     double topcek =0;
     
     
        while (true) {            
            System.out.println("---ATM MENU---");
            System.out.println("1-Bakiye goruntuleme");
            System.out.println("2-Para yatirma");
            System.out.println("3- Para cekme");
            System.out.println("4-CIKIS");
            System.out.println("Lutfen seciminizi yapin");
            
            secim = sc.nextInt();
            
            switch (secim) {
                case 1:
                    System.out.println("Suan hesabinizdaki bakiye tutari:" + bakiye);
                    islemsayisi++;
                    break;
                    
                    
                case 2:
                    System.out.println("Yatirmak istediginiz tutar?");
                    tutar = sc.nextDouble();
                    if (tutar>0){
                       bakiye += tutar;
                       topyat += tutar;
                       islemsayisi++;
                        
                        
                        
                    }   else {
                        System.out.println("HATA!!! Yanlis giris ");
                    }      
                    break;
                    
                case 3:
                    System.out.println("Cekmek istedigin tutar?");
                    tutar = sc.nextDouble();
                    
                    if (tutar>0) {
                        
                        
                        if (tutar <= bakiye){
                            bakiye -= tutar;
                            topcek += tutar;
                            islemsayisi++;
                            
                        }else{
                            
                            System.out.println("Yetersiz bakiye");
                            
                        }
                    }else {
                        System.out.println("gecersiz tutar dogru bir giris yapin");
                    }
                    break;
                    
                    
                case 4:
                    System.out.println("---HESAP OZETIN---");
                    System.out.println("Kalan Bakiye: " + bakiye);
                    System.out.println("Yapilan islem sayisi: " + islemsayisi);
                    System.out.println("Toplam yatirilan para: " + topyat);
                    System.out.println("toplam cekilen para: " + topcek);
                    
                    System.out.println("ATM'den cikis yapiliyor...");
                    return;
                    
                    
                    
                default:
                    System.out.println("GECERSIZ GIRIS!!!");
                    
            }
        }
        
    }
}





