package farm;

public class Chicken {

    private String name;
    public static int totalChicken = 0;

    // constructor
    public Chicken(String name){

        if(name != null){
            this.name = name;
        }

        totalChicken++;

        if(name != null){
            System.out.println("Total: " + totalChicken + " " + "Name: " + name);
        }

        if(name == null){
            System.out.println("Total: " + totalChicken + " " + "Name: Chicken " + totalChicken);
        }
    }
}