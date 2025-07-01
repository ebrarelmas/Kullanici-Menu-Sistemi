/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) { //dongunun icerisindeki sartlar dogru oldugu surece menuyu ekrana yazdirmaya devam edecek.
            System.out.println(" \n Proje 1 Kullanici Menusu:");
            String menu = "\n  1-Karakter dizisini cizdir\n  2-Buyuk harfe cevir\n  3-Sifrele ve sifre coz\n  4-Harfi cizdir";
            System.out.println(menu + "\nLutfen bir secim yapiniz->");
            System.out.println("Dur: Menuyu Sonlandir");

            String secim = sc.nextLine();//kullanicidan yapmasini istedigi bir degeri alacak.

            if (secim.equals("dur") || secim.equals("Dur") || secim.equals("DuR") || secim.equals("DUR")) {
                break;// kullanici bu ifadeleri girmedigi surece sistem menuyu dondurmeye devam edecek.
            }
            if (secim.equals("1")) {//kullanıcı 1 degerini girerse bu sart blogu calisacak.

                System.out.print("Bir dizi karakter giriniz: ");
                String input = sc.nextLine();//kullanicidan bir dizi karakter alinacak.

                karakterDizisiCizdir(input);//metot ekrana yazdirilacak.

            } else if (secim.equals("2")) {//kullanıcı 2 degerini girerse bu sart blogu calisacak.
                System.out.println("cumle giriniz");
                String input = sc.nextLine();//kullanicidan bir metin alinacak.

                System.out.println(buyukHarfeCevir(input));// metot ekrana yazdirilacak.

            } else if (secim.equals("3")) {//kullanıcı 3 degerini girerse bu sart blogu calisacak.
                System.out.println("cumle giriniz");
                String input = sc.nextLine();//kullanicidan bir metin alinacak.

                System.out.println(sifreleCoz(input));//metot ekrana yazdirilacak.

            } else if (secim.equals("4")) { //kullanıcı 4 degerini girerse bu sart blogu calisacak.
                String karakter;
                int boyut;
                while (true) {//kullanici gecerli karakter girene kadar bu blok calisacak.
                    System.out.println("bir karakter giriniz: ");
                    karakter = sc.nextLine();//ilk asamada kullanicinin karakter girmesi istenecek.
                    if (karakter.equals("X") || karakter.equals("Z"))//kullanicinin girdigi karakter, bu ikisinden birisini saglıyorsa metotun icerisindeki islem calisacak.
                    {
                        break;
                    }
                    System.out.println("girilen karakter gecersiz,bir daha deneyin");// bu iki degerden farklı bir deger girilirse ekrana bu yazdirilcak ve dongu basa donecek.
                }

                while (true) {//kullanici gecerli boyut degeri girene kadar bu blok calisacak.
                    System.out.println("boyut degeri giriniz");
                    boyut = Integer.parseInt(sc.nextLine());// kullanicidan boyut degeri alinacak.
                    if (boyut % 2 == 1 && boyut >= 5)//kullanicinin girdigi boyut degeri bu iki sarti aynı anda sagliyorsa metotun icerisindeki islem calisacak.
                    {
                        break;
                    }
                    System.out.println("girilen boyut gecersiz, bir daha deneyin");//girilen boyut gecersizse tekrar deger girmesi istenecek.
                }
                harfCizdir(karakter, boyut);//metot ekrana yazdirilacak.

            }
        }

    }

    public static void karakterDizisiCizdir(String input) {

        for (int i = 0; i < input.length(); i++) {//kullanicidan alınan metnin her karakterinde dolaşilmasi için dongu kuruldu.

            if (input.charAt(i) == 'b') {//kullanicinin girdigi metinde b karakteri varsa bu blok calisacak.
                if (i > 0 && input.charAt(i - 1) >= '1' && input.charAt(i - 1) <= '9') {//kullanicinin metninde bu harften once sayi kullanip kullanmadiği kontrol edilecek.
                    for (int j = 0; j < input.charAt(i - 1) - 48; j++) {//kullanicinin girdigi harften bir onceki basamagin kontrolü dongu icine aliniyor.
                        System.out.print(" ");//eger dogruysa girilen sayi kadar bosluk ekrana basilacak
                    }
                } else {//eger girilen sayi bu aralikta degilse veya bu iki sarti saglamiyorsa ekrana bir adet bosluk basilacak.
                    System.out.print(" ");
                }
            }
            if (input.charAt(i) == 's') {//kullanicinin girdigi metinde s karakteri varsa bu blok calisacak.
                if (i > 0 && input.charAt(i - 1) >= '1' && input.charAt(i - 1) <= '9') {//kullanicinin metninde bu harften once sayi kullanip kullanmadiği kontrol edilecek.
                    for (int j = 0; j < input.charAt(i - 1) - 48; j++) {//kullanicinin girdigi harften bir onceki basamagin kontrolü dongu icine aliniyor.
                        System.out.print("*");//eger dogruysa girilen sayi kadar yildiz ekrana basilacak.
                    }

                } else {//eger girilen sayi bu aralikta degilse veya bu iki sarti saglamiyorsa ekrana bir adet yildiz basilacak.
                    System.out.print("*");
                }

            }
            if (input.charAt(i) == 'n') {//kullanicinin girdigi metinde n karakteri varsa bu blok calisacak.
                if (i > 0 && input.charAt(i - 1) >= '1' && input.charAt(i - 1) <= '9') {//kullanicinin metninde bu harften once sayi kullanip kullanmadiği kontrol edilecek.
                    for (int j = 0; j < input.charAt(i - 1) - 48; j++) {//kullanicinin girdigi harften bir onceki basamagin kontrolü dongu icine aliniyor.
                        System.out.print("\n");//eger dogruysa girilen sayi kadar ekrana yeni bos satir basilacak.
                    }
                } else {//eger girilen sayi bu aralikta degilse veya bu iki sarti saglamiyorsa ekrana bir adet yeni bos satir basilacak.
                    System.out.print("\n");
                }
            }
            if (input.charAt(i) == 't') {//kullanicinin girdigi metinde t karakteri varsa bu blok calisacak.
                if (i > 0 && input.charAt(i - 1) >= '1' && input.charAt(i - 1) <= '9') {//kullanicinin metninde bu harften once sayi kullanip kullanmadiği kontrol edilecek.
                    for (int j = 0; j < input.charAt(i - 1) - 48; j++) {//kullanicinin girdigi harften bir onceki basamagin kontrolü dongu icine aliniyor.
                        System.out.print("   ");//eger dogruysa girilen sayi kadar ekrana 3 adet bosluk basilacak.
                    }
                } else {//eger girilen sayi bu aralikta degilse veya bu iki sarti saglamiyorsa ekrana bir adet 3 tane bosluk basilacak.
                    System.out.print("   ");
                }
            }
        }
    }

    public static String buyukHarfeCevir(String input) {

        String s = "";//kullanıcının girecegi ifade bu degiskende tutulacak
        input = " " + input;

        for (int i = 0; i < input.length(); i++) {//kullanicidan alinan input degerinin her basamagi dongu ile kontrol edilecek.
            char ch = input.charAt(i);//girilen cumlede her basamaktaki karakteri tutacak degisken atandi.
            if (ch == ' ') {//cumledeki bosluk kontrol edilmesi icin if blogu acildi.
                s += ch; // eger karakter bosluksa ayni sekilde yazildi.
                i++;//karakter basamagi 1 arttirildi.
                ch = input.charAt(i);//1 arttirilan basamaktan sonrasinda harf varsa;
                if (ch >= 65 && ch <= 90) {
                    s += ch;
                } else {
                    s += (char) (ch - 32);//o harf buyuk harfe cevrilecek.ASCII tablosunda bir harfin buyuk ve kucuk degeri arasindaki fark 32'dir.
                }
            } else {
                s += ch;//karakter bosluk degilse aynisi yazilacak.
            }
        }
        return s;//yeni olusan degiskenimi döndurulecek.

    }

    public static String sifreleCoz(String input) {
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    sb.append((char) ((ch - 'A' + 3) % 26 + 'A')); // Caesar +3
                } else if (Character.isLowerCase(ch)) {
                    sb.append((char) ((ch - 'a' - 3 + 26) % 26 + 'a'));
                } else {
                    sb.append(ch);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void harfCizdir(String karakter, int boyut) {

        if (boyut % 2 == 1 && boyut >= 5) {//kullanici bu iki sarti saglayan boyut degeri girdiyse bu blok calisacak.
            int k = boyut;//boyut için kısa bir degisken atadim.

            if (karakter.equals("X")) {//kullanici bu ifadeyi girdiyse bu blok calisacak.

                for (int i = 1; i <= k; i++) {// atanan i degeri boyut degerine kucuk esit olduğu surece dongu calisacak.
                    for (int j = 1; j <= k; j++) {//atanan j degeri boyut degerine kucuk esit olduğu surece dongu calisacak.
                        if (j == i || j == k - i + 1)// bu iki sarttan en az biri saglanirsa ekrana yildiz bastırılacak.
                        {
                            System.out.print("*");
                        } else//iki sartta saglanmazsa ekrana bosluk bastirilacak.
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();//j<=k+1 oldugunda donguden cikilacagi ve bir alt satira gecilmesi gerektigi icin ekrana bos bir ifade bastirilacak.
                }
            } else if (karakter.equals("Z")) {//kullanici bu ifadeyi girdiyse bu blok calisacak.

                for (int i = 0; i < k; i++) {//atanan i degeri boyut degerinden kucuk olduğu surece dongu calisacak.
                    for (int j = 0; j < k; j++) {//atanan j degeri boyut degerinden kucuk olduğu surece dongu calisacak.
                        if (i == 0 || i == k - 1 || j == k - 1 - i)// bu uc sarttan en az biri saglanirsa ekrana yildiz bastırılacak.
                        {
                            System.out.print("*");
                        } else//uc sartin da hicbiri saglanmazsa ekrana bosluk bastirilacak.
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();//j<k+1 oldugunda donguden cikilacagi ve bir alt satira gecilmesi gerektigi icin ekrana bos bir ifade bastirilacak.
                }
            }
        }
    }

}
