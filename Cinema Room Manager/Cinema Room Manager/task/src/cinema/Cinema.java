package cinema;

public class Cinema {

    public static void main(String[] args) {
        System.out.print("Cinema:\n");
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                System.out.print("  ");
                for (int j = 0; j < 8; j++) {
                    System.out.print(j + 1 + " ");
                }
                System.out.print("\n");
            } else {
                System.out.print(i + " ");
                for (int k = 0; k < 8; k++) {
                    System.out.print("S ");
                }
                System.out.print("\n");
            }
        }
    }
}