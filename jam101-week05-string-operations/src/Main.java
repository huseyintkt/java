/*
*  1)  Verilen bir isim ve soyismin sadece bas harflerini Uppercase'e cevirin.
*      ornek: asik veysel ==> Asik Veysel
*
*  2)  0'dan 100'e kadar olan sayilari, bir satirda 10 sayi ve
*      her sayinin arasinda virgul olacak sekilde yazdiriniz.
*
*  3)  0'dan 100'e kadar olan prime (asal sayilari) yatay olarak yazdirin.
*      bulunmasi gereken sonuc: 2, 3, 5, 7, 11 ....
*
*  4)  Kucuk harfler, buyuk harfler, ozel karakterler ve sayilardan olusan
*      8 ile 16 (hane) uzunluklari arasinda guvenli 50 adet sifre olusturunuz.
*
*  5)  Asagidaki sekli programlama yapilarini kullanarak cizdiriniz.
*   *
*   **
*   ***
*   ****
*   *****
*   ******
* */

import jam101.week05.string.operations.StringOperations;

public class Main {
    public static void main(String[] args) {

        StringOperations.printNumbers(100);

        StringOperations.printPrimeNumbers(100);

        StringOperations.drawTriangle(10);
    }
}