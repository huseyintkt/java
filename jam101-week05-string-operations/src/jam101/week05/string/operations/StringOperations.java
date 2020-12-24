package jam101.week05.string.operations;
import java.util.ArrayList;

public class StringOperations {

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
        System.out.println("Soru 1 :");
        System.out.println(result + pUpperLimit);
    }
}