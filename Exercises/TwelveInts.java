/**
 * Created by jc225828 on 1/09/17.
 */
public class TwelveInts {
    public static void main(String[] args)
    {
        int[] numbers = {10, 12, 11, 15, 20, 25, 78, 100, 19, 3, 4, 69};
        int i;
        for(i = 0; i < numbers.length; i++)
            System.out.print(numbers[i]+ " ");
        System.out.println();
        for(i = numbers.length - 1; i >= 0; i--)
            System.out.print(numbers[i]+ " ");
        System.out.println();
    }
}
