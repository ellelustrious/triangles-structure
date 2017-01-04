import java.util.Scanner;
/**
 * Write a description of class Trianlgle here.
 * 
 * @author Michelle Pham
 * @version Oct 20, 2016 / Final
 */
public class Trianlgle
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTriangles = 0;
        while (numTriangles <= 0) 
        {
            System.out.print("How many rows in the triangle? ");
            if (in.hasNextInt()) 
            {
                numTriangles = in.nextInt();
            } else 
            {
                in.next();
            }
        }
        System.out.println(numTriangles);

        for(int r = 0; r < numTriangles; r++)
        {
            for (int k = 0; k < numTriangles-r; k++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*r+1; j++)
            {
                System.out.print("+");
            }
            System.out.println("");
        }
    }
}