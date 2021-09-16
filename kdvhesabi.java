import java.util.Scanner;

public class kdvhesabi {
    public static void main(String[] args) {
        // değişkenleri tanımlayalım 
        double fiyat, kdvOrani = 0.18,kdvliFiyat,kdvTutari;

        // import sınıfını tanımlayalım 
        Scanner input = new Scanner(System.in);

        // kullanıcıdan input alalım
        System.out.println("ücret giriniz");
        fiyat = input.nextDouble();

        kdvTutari = fiyat*kdvOrani;
        kdvliFiyat = fiyat + kdvTutari;

        System.out.println("ücretiniz " + fiyat);
        System.out.println("KDV oranınız" + kdvOrani);
        System.out.println("KDV tutarınız " + kdvTutari);
        System.out.println("KDV'li ücretiniz " + kdvliFiyat);
} 
}
