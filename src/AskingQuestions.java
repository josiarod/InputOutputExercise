    import java.util.Scanner;

    public class AskingQuestions
    {
        public static void main( String[] args )
        {
            Scanner keyboard = new Scanner(System.in);

            double num1, num2, average;

            System.out.print( "First temperature? " );
            num1 = keyboard.nextInt();

            System.out.print( "Second temperature? " );
            num2 = keyboard.nextInt();

            average = (num1 + num2) / 2;

            System.out.println("The average value is : " + average);
        }
    }

