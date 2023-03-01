import java.util.Scanner;

public class kullaniciGirsi {
  public static void main(String[] args) {

    String kullaniciAdi;
    int sifre; 

    Scanner input = new Scanner(System.in);

    System.out.print("Kullanıcı Adını Giriniz : ");
    kullaniciAdi = input.nextLine();

    System.out.print("Şifreyi Giriniz : ");
    sifre = input.nextInt();

    if(kullaniciAdi.equals("sude") && sifre == 123){
      System.out.println("Başarıyla Giriş Yaptınız");
    }
    else{
      System.out.println("Hatalı Giriş Yaptınız !!");
    }





    
  }
  
}
