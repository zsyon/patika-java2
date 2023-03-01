import java.util.Scanner;
/**
 * hesapMakinesi
 */
public class hesapMakinesi {
  public static void main(String[] args) {
    int sayi1, sayi2, secim;

    Scanner input = new Scanner(System.in);

    System.out.print("İlk Sayıyı Giriniz : ");
    sayi1 = input.nextInt();
    System.out.println("İlk Sayı : " + sayi1);

    System.out.print("İkinci Sayıyı Giriniz : ");
    sayi2 = input.nextInt();

    System.out.println("İlk Sayı : " + sayi1);
    System.out.println("İkinci Sayı : " + sayi2);

    System.out.println("Yapmak İstediğiniz İşlemi Seçin : ");
    System.out.println("1-Toplama /n 2-Çıkarma /n 3-Çarpma /n 4-Bölme");

    int toplama = sayi1+sayi2;
    int cikarma = sayi1-sayi2;
    int carpma = sayi1*sayi2;
    int bolme = sayi1/sayi2;

    secim = input.nextInt();

    switch (secim) {
      case 1:
        
        break;
    
      default:
        break;
    }

    


  }
}