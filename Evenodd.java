import java.lang.*;
import java.util.Scanner;

public class Evenodd
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the input value: ");
        int numValue = scanner.nextInt();
        if (numValue % 2 == 0)
        {
            System.out.println("The given number is an EVEN integer");
        } else
        {
            System.out.println("The given number is an ODD integer");
        }
    }
}