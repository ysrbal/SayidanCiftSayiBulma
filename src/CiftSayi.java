import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        int n1, adet = 0, toplam = 0;
        double ort;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        n1 = inp.nextInt();

        for (int n2 = 1; n2 <= n1; n2++) {
            if ((n2 % 3 == 0) && (n2 % 4 == 0)) {
                System.out.println("3'e ve 4'e Bolunen Sayi : " + n2);
                toplam += n2;
                adet++;

            }
        }
        System.out.println("Toplam : " + toplam);
        ort = toplam / (adet - 1);
        System.out.println("Ortalama Deger : " + ort);
    }
}