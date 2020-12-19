package jam101.week04;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private int score = 100;
    private int life = 4;
    private int predictedWagon;
    private int hidingWagon;

    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    /**
     * Bu metod, 1'den parametre olarak gonderilen degere kadar random bir sayi uretir.
     */
    private int getRandomNumber(int pNumber){
        return random.nextInt(pNumber) + 1;
    }

    /*
    * Bu metod, oyunu baslatir.
    * Supheli 1'den 10'a kadar uretilen random bir vagonda saklanir.
    * Kullanici suphelinin bulundugu vagonu tahmin etmeye baslar.
    * Kullanicinin toplam 4 hakki vardir ve her yanlış tahminde toplam puani 25 dusurulur.
    * Her yanlis tahminde kullaniciya dogru bilmesi icin ipucu verilir.
    * Oyun sonlandiginda kullaniciya puani gosterilir.
    */
    public void start(){

        System.out.println("Oyun başladı. Bol şanslar!");

        hidingWagon = getRandomNumber(10);

        while(life > 0){
            System.out.println("Sizce şüpheli hangi vagonda?");
            predictedWagon = scanner.nextInt();

            if(predictedWagon == hidingWagon){
                System.out.println("Bravo " + (5 - life)  +". de doğru bildiniz! Puanınız : " + score);
                break;
            }

            if(predictedWagon < hidingWagon){
                --life;
                score -= 25;
                if(life != 0){
                    System.out.println("Lütfen daha yüksek bir tahminde bulunun!");
                }
                continue;
            }

            if(predictedWagon > hidingWagon){
                --life;
                score -= 25;
                if(life != 0){
                    System.out.println("Lütfen daha düşük bir tahminde bulunun!");
                }
                continue;
            }
        }

        if(life == 0){
            System.out.println("Malesef şüpheliyi bulamadınız! Skorunuz : " + score);
        }
    }
}