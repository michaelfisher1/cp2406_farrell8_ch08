/**
 * Created by jc225828 on 1/09/17.
 */
import java.util.Scanner;
public class DistanceFromAverage {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[20];
        double entry;
        double total = 0;
        double average = 0;
        final int quit = 99999;
        int x = 0, y;
        System.out.print("Enter a numeric value or " + quit + " to quit the program: ");
        entry = input.nextDouble();
        while(entry != quit && x < numbers.length) {
            numbers[x] = entry;
            total += numbers[x];
            ++x;
            if (x < numbers.length) {
                System.out.print("Enter a numeric value or " + quit + " to quit the program: ");
                entry = input.nextDouble();
            }
        }
        if(x == 0)
            System.out.print("Average cannot be computer because no numbers were entered");
        else {
            average = total / x;
            System.out.print("You entered " + x + " numbers and their average is " + average);
            for (y = 0; y < x; ++y)
                System.out.println(numbers[y] + " is " + (numbers[y] - average) + " away from the average.");
        }
    }
}
