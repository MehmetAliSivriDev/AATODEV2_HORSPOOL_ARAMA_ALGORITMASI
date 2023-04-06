import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner scanner = new Scanner(System.in);
        
        //Metin dosyamızın uzantisini belirtiyoruz.
        String fileName = "alice_in_wonderland.txt";
        
        Scanner file = new Scanner(new File(fileName));
        String metin = file.useDelimiter("\\Z").next();
        file.close();
        
        //Kullanicidan Aratacagi Kelimeyi Aliyoruz
        System.out.print("Alice In Wonderland Metninin Icerisinde Aratacaginiz Kelimeyi Giriniz= ");
        String aranacakKelime = scanner.nextLine();
        
        //Hesaplamayi Yaptiriyoruz
        int sonuc = horspoolArama(metin, aranacakKelime);
        
        //Sonucu Yazdiriyoruz
        System.out.println(aranacakKelime + " kelimesi Alive In Wonderland metninde toplamda " + sonuc + " kez geciyor.");
    }
    
    //Harspool Arama Algoritmasi
    public static int horspoolArama(String kelime, String aranacakKelime) {
        int n = kelime.length();
        int m = aranacakKelime.length();
        if (m > n) {
            return 0;
        }
        int[] shift = new int[256];
        for (int i = 0; i < 256; i++) {
            shift[i] = m;
        }
        for (int i = 0; i < m - 1; i++) {
            shift[aranacakKelime.charAt(i)] = m - i - 1;
        }
        int sayac = 0;
        int i = m - 1;
        while (i < n) {
            int k = 0;
            while (k < m && aranacakKelime.charAt(m - 1 - k) == kelime.charAt(i - k)) {
                k += 1;
            }
            if (k == m) {
                sayac += 1;
            }
            if (shift[kelime.charAt(i)] > 0) {
                i += shift[kelime.charAt(i)];
            } else {
                i += m;
            }
        }
        return sayac;
    }
}