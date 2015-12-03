import java.util.Scanner;

public class Main {

    public static int rows = getRow();

    public static void main(String[] args) {

        triangleOne();
        pyramidOne();

    }

    private static int getRow() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows you wants in a pyramid: ");
        int rowNumber = in.nextInt();
        return rowNumber;
    }


    private static void triangleOne() {
        int rowCount = 1;
        System.out.println("Pyramid 1: ");
        for (int i = rows; i > 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();
            rowCount++;
        }
    }
    private static void pyramidOne() {
        int rowCount = 1;
        System.out.println("Pyramid 1: ");
        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();
            rowCount++;
        }
    }
}


// http://javaconceptoftheday.com/how-to-create-pyramid-of-numbers-in-java/