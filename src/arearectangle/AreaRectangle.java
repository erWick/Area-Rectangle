/*
 * Erik Hall
 * AreaRectangle.java
 * This program takes user inputs for
 * length and width and processes them
 * into the area of a rectangle rounded
 * to two decimals places
 */

package arearectangle;

//Scanner utility needed for user inputs
import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args) {
        double length;  
        double width;
        try (Scanner reader = new Scanner(System.in) // Reading from System.in
        ) {
            System.out.println("Enter length:");
            length = reader.nextDouble();
            System.out.println("Enter width:");
            width = reader.nextDouble();
        }
        double area = Math.round((width*length) * 100);
        System.out.println("Area is " + area / 100 + " cm with a " + length + " cm length and " + width + " cm width");
    }
    
}
