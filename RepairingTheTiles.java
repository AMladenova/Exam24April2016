import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by mlade on 13/03/2017.
 */
public class RepairingTheTiles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double sideLenghtArea = Double.parseDouble(console.nextLine());
        double squareArea = sideLenghtArea * sideLenghtArea;

        double tileWidth = Double.parseDouble(console.nextLine());
        double tileLength = Double.parseDouble(console.nextLine());
        double singleTileArea = tileLength * tileWidth;

        double benchWidth = Double.parseDouble(console.nextLine());
        double benchLenght = Double.parseDouble(console.nextLine());
        double benchArea = benchLenght * benchWidth;

        double areaToCover = squareArea - benchArea;
        double minutesPerTile = 0.2;

        double numberOfTiles = areaToCover / singleTileArea;
        double necessaryTime = numberOfTiles * minutesPerTile;

        System.out.println(doubleToStringCSharpLike(numberOfTiles));
        System.out.println(doubleToStringCSharpLike(necessaryTime));
    }
    private static String doubleToStringCSharpLike(double value) {
        int digits = 15;
        if (Math.abs(value) >= 1.0d) {
            digits -= Double.toString(value).split("[.,]")[0].length();
        }
        String format = "0." + new String(new char[digits]).replace("\0", "#");
        DecimalFormat df = new DecimalFormat(format);
        return df.format(value);
    }
}
