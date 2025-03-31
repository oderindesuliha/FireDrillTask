package chapter4;

public class Checkerboard {
    public static void main(String[] args) {

        for (int count = 1; count <= 8; count++) {
            if (count % 2 == 0) System.out.print(" ");
        for (int counter = 1; counter <= 8; counter++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            System.out.println();


    }
}