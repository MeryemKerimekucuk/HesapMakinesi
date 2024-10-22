import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner k1 = new Scanner(System.in);

         boolean devam=true;
         while (devam) {

             System.out.print("1.Sayıyı Giriniz : ");
             double sayi1 = k1.nextInt();

             System.out.print("2. Sayıyı Giriniz : ");
             double sayi2 = k1.nextInt();

             System.out.println("Yapmak İstediğiniz İşlemini Seçiniz : (+ , - , / , * )");
             char islem = k1.next().charAt(0);

             double sonuc;

             switch (islem) {
                 case '+':
                     System.out.println(sonuc = sayi1 + sayi2);
                     break;
                 case '-':
                     System.out.println(sonuc = sayi1 - sayi2);
                     break;
                 case '*':
                     System.out.println(sonuc = sayi1 * sayi2);
                     break;
                 case '/':
                     if (sayi2 == 0) {
                         System.out.println("Bölme işlemi yapılamaz!");
                     } else {
                         System.out.println(sonuc = sayi1 / sayi2);
                     }
                     break;
                 default:
                     System.out.println("Geçersiz operatör! Lütfen tekrar deneyiniz.");
                     break;


             }


             System.out.println("Devam etmek istiyor musunuz? : (Evet / Hayır )");
             k1.nextLine();
             String devamlılık = k1.nextLine();

             if (devamlılık.equalsIgnoreCase("Hayır")) {
                 devam = false;
                 System.out.println("İşlemi sonlandırdınız");
             }
         }

    }
    }

