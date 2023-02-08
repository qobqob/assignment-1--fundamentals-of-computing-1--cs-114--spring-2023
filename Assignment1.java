
import java.util.Random;
import java.util.Scanner;


public class Assignment1 {


    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String str; // string
        String temp = "";
        int number; // number in fahrenheit
        Random random = new Random();
        int rand;
        double celcius;
        System.out.println("       YYYY     YYYYYY       QQQQQQQQQQQQQQQQ");
        System.out.println("        YYYY    YYYYY        QQQQ       QQQQ");
        System.out.println("          YYYY YYYY          QQQQ       QQQQ");
        System.out.println("             YYY             QQQQ       QQQQ");
        System.out.println("             YYY             QQQQQQQQQQQQQQQ");
        System.out.println("             YYY                   QQQQ");
        System.out.println("             YYY                   QQQQ");
// print out YQ
        System.out.println();
        System.out.println("Please enter a 5-character string: ");
        str = input.next();
        System.out.println("Please enter a number in Fahrenheit: ");
        number = input.nextInt();

        str = str.substring(1, 4);



        celcius = 5/9 *(number - 32);
        rand = random.nextInt(16384) + 32;

        System.out.println("Random number will come up. Continuing");

        str = celcius + temp + rand;

        System.out.println("Your new string will be "+str);


    }

}
