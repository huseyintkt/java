package farm;

public class Cow {
    
    private String name;
    static int totalCow = 0;

    public Cow(String name){

        if(name != null){
            this.name = name;
        }

        totalCow++;

        if(name != null){
            System.out.println("Total: " + totalCow + " " + "Name: " + name);
        }

        if(name == null){
            System.out.println("Total: " + totalCow + " " + "Name: Cow " + totalCow);
        }
    }
}