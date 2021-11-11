import java.util.Scanner;

public class euclideanSpace {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Please enter 4 values, for x1 & y1 and for " +
                        "x2 & y2 in order to find their euclidean distance: ");

        Point values = new Point();

        values.x1 = SCANNER.nextInt(); values.y1 = SCANNER.nextInt();
        values.x2 = SCANNER.nextInt(); values.y2 = SCANNER.nextInt();

        System.out.println("The euclidean distance is: " + values.EuclideanDistance(values.eDistanceOutput));

    }
}
