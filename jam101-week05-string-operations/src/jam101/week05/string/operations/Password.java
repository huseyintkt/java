package jam101.week05.string.operations;

import java.util.ArrayList;
import java.util.Random;

public class Password {

    static Random random = new Random();

    /**
     * 8 ile 16 karakter uzunlugunda, icerisinde en az bir tane kucuk harf, buyuk harf, rakam ve sembol bulunduruan toplam 50 sifreyi console a yazdirir.
     */
    public static void printPasswords(int pNumber){
        System.out.println("Soru 4 :");
        for(int i = 0; i < pNumber; i++){
            int length = random.nextInt(9) + 8;
            System.out.println("Password : " + generatePassword(length) + "\n");
        }
    }

    /**
     * Bu metod, random sifre olusturur.
     * Sifrenin ilk dort karakterinde random olarak en az bir kucuk harf, buyuk harf, rakam ve sembol bulunmasi icin gerekli kontrolleri yapar.
     * Sifrenin geri kalan kisminda random olarak kucuk harf, buyuk harf, rakam ve sembol yerlestirmeye devam eder.
     */
    private static String generatePassword(int pLength){
        String password = "";
        ArrayList<Integer> methodsUsed = new ArrayList<>();

        for(int i = 0; i < pLength; i++) {
            if(i < 4){
                int randomFunction = random.nextInt(4);
                if(methodsUsed.indexOf(randomFunction) == -1){
                    methodsUsed.add(randomFunction);
                    password = addCharacterToPassword(password, randomFunction);
                } else{
                    --i;
                }
            } else{
                int randomFunction = random.nextInt(4);
                password = addCharacterToPassword(password, randomFunction);
            }
        }
        return password;
    }

    /**
     * Bu metod, parametre olarak gonderilen fonksiyona gore sifreye yeni karakter ekler.
     */
    private static String addCharacterToPassword(String pPassword, int pRandomFunction){
        switch (pRandomFunction) {
            case 0:
                pPassword += getRandomLower();
                break;
            case 1:
                pPassword += getRandomUpper();
                break;
            case 2:
                pPassword += getRandomNumber();
                break;
            case 3:
                pPassword += getRandomSymbol();
                break;
        }
        return pPassword;
    }

    /**
     * Bu metod, random olarak bir kucuk harf geriye dondurur.
     */
    private static char getRandomLower() {
        String lowerLetters = "qwertyuopilkjhgfdsazxcvbnm";
        return lowerLetters.charAt(random.nextInt(lowerLetters.length()));
    }

    /**
     * Bu metod, random olarak bir buyuk harf geriye dondurur.
     */
    private static char getRandomUpper() {
        String upperLetters = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        return upperLetters.charAt(random.nextInt(upperLetters.length()));
    }

    /**
     * Bu metod, random olarak bir rakam geriye dondurur.
     */
    private static char getRandomNumber() {
        String numbers = "0123456789";
        return numbers.charAt(random.nextInt(numbers.length()));
    }

    /**
     * Bu metod, random olarak bir sembol geriye dondurur.
     */
    private static char getRandomSymbol() {
	    String symbols = "!@#$%^&*(){}[]=<>/,.";
        return symbols.charAt(random.nextInt(symbols.length()));
    }
}