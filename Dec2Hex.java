import java.util.Scanner;
import java.util.logging.Logger;

class Dec2Hex
{
    public static int Arg1;
    static Logger logger = Logger.getLogger(Dec2Hex.class.getName());
    public static void main(String args[])    {
        /* checking if a parameter was provided */
        if (args.length == 0) {
            System.out.println("No argument provided");
            System.exit(0);
        }

        /* if parameter is of type int */
        try {
            Arg1 = Integer.parseInt(args[0]);
            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem, num;
            num = Arg1;
            String hexadecimal = "";
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            while (num != 0) {
                rem = num % 16;
                hexadecimal = ch[rem] + hexadecimal;
                num = num / 16;
            }
            System.out.println("Hexadecimal representation is: " + hexadecimal);
        }
        /* if parameter isn't of type int */
        catch (NumberFormatException e) {
            logger.info("Argument provided is not an integer");
            System.exit(0);
        }
    }
}

