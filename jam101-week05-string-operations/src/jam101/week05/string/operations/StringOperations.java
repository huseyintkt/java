package jam101.week05.string.operations;
import java.util.ArrayList;
import java.util.Arrays;

public class StringOperations {

    /*
     * Bu metod, parametre olarak gonderilen isim ve soyismin ilk harflerini buyuk harfe cevirir ve ekrana yazar.
     * */
    public static void convertToUppercaseTheFirstLetters(String pFullName){
        String[] list = pFullName.split(" ");
        String fullNameWithUppercase = "";

        for(int i = 0; i < list.length; i++){
            String firstLetter = String.valueOf(list[i].charAt(0));
            list[i] = list[i].replace(firstLetter, firstLetter.toUpperCase());
        }

        for(int i = 0; i < list.length; i++){
            fullNameWithUppercase += list[i] + " ";
        }

        System.out.println("Soru 1 :");
        System.out.println(pFullName + " => " + fullNameWithUppercase.trim());
    }

    /*
    * Bu metod, parametre olarak gonderilen sayiya kadar olan sayilari,
    * bir satirda 10 sayi ve aralarinda virgul olacak sekilde ekrana yazdirir.
    * */
    public static void printNumbers(int pUpperLimit){
        String result = "";
        for (int i = 0; i < pUpperLimit; i++){
            if(i%10 == 0 && i != 0){
                result += i + "," + "\n";
            }else{
                result += i + ", ";
            }
        }
        System.out.println("Soru 2 :");
        System.out.println(result + pUpperLimit);
    }

    /*
     * Bu metod, parametre olarak gonderilen sayiya kadar olan
     * tum asal sayilari ekrana yazdirir.
     * */
    public static void printPrimeNumbers(int pUpperLimit){
        ArrayList<Integer> primeNumber = new ArrayList<>();

        for (int i = 2; i <= pUpperLimit; i++){
            boolean status = true;
            for (int j = 2; j < i/2; j++){
                if( i % j == 0){
                    status = false;
                }
            }
            if(status){
                primeNumber.add(i);
            }
        }

        System.out.println("Soru 3 :");
        System.out.println(primeNumber);
    }

    /*
    * Bu metod, parametre olarak gonderilen satir sayisi kadar yildiz karakterleri ile ekrana ucgen cizer.
    * */
    public static void drawTriangle(int pRow){
        String result = "";

        for(int i = 1; i <= pRow; i++){
            for(int j = 1; j<= i; j++){
                result += "*";
            }
            result += "\n";
        }

        System.out.println("Soru 5 :");
        System.out.println(result);
    }
}