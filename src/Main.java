public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print("\n");
            for (int j = 1; j < 11; j++)
            {
                if ((i * j)<10)
                    System.out.print(" " + " " + " " + (i * j));
                else
                    System.out.print(" " + " " + (i * j));
            }

        }
    }

}