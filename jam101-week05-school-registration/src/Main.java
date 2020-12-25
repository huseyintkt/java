/*
* Merhaba Arkadaslar
* Bu haftaki diger odevimiz Sinif Kayit Sistemi olacaktir.
* Sizden istenilen program asagidaki ozellikleri saglamasi gerekecektir.
* 5 sinifi olan bir okul olustunurunuz. Siniflar ise 1 den 5. sinifa kadardir.
* Bu siniflara ogrenci dagilimi yaslarina gore olacaktir. Ogreciler  6 ile 10 yas araligindadir.
* Toplam 10 ogrenci mevcuttur.  Sinaflara ogrenciler esit sayida dagitilacatir.
* Ogrencı isim, soyisim ve yaşı konsoldan ayrı ayrı girilecektir.
* Ogrencilerin okul numaralari ise; isminin ilk iki karakteri, soy isminin son üç karakteri
* ve yaşının birlesmesinden olusacaktir.
* Her bir siniftaki ogrencilerin kaydinin gorunumu okul numarasi,
* isim ve buyuk harfler ile soyisminin kombinesi seklinde bilgilerde kullanilacaktir.
* Ornek Kayıt: (Hans Muller --> ''HALER7, Hans MULLER")
* Programda bızlere Kayıt gorunumu ve sınıfını beraber getırerek ekrana yazdıracaktır.
*
**/

import jam101.week05.School;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        school.manager();
    }
}