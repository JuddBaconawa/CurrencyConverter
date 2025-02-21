//packages

//imports
import java.util.Scanner;

//main class - App
public class App {

    // main class that runs the app
    public static void main(String[] args) throws Exception {

        double currentValue = 0;
        double newValue = 0;


        // scanner initialized
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Welcome! Welcome to our money converter. Enter your currency first, followed by what currency you want to convert the value to.");
        pressAnyKeyToContinue();

        System.out.println("Enter the value of money you have: ");
        double firstValue = scanner.nextDouble();

        System.out.println("Enter 1-4 to identify your currency. Enter 1 for dollar, 2 for pounds, 3 for euro, and 4 for yen.");
        int originalCurrency = scanner.nextInt();

        //switch case to choose from dollars, pounds, euro, and yen
        switch (originalCurrency) {
            case 1:
                System.out.println("The currency of your denomination is dollars.");
                //return Calculations.japanYen(firstValue);
                System.out.println("The value is " + firstValue + " the cost for dollar is " + firstValue * Calculations.usDollars());
                newValue = firstValue * Calculations.usDollars();
                break;
            case 2:
                System.out.println("The currency of your denomination is pounds");
                System.out.println("The value is " + firstValue + " the cost for dollar is " + firstValue * Calculations.brittishPound());
                newValue = firstValue * Calculations.brittishPound();
                break;
            case 3:
                System.out.println("The currency of you denomination is euro.");
                System.out.println("The value is " + firstValue + " the cost for dollar is " + firstValue * Calculations.euroDollar());
                newValue = firstValue * Calculations.euroDollar();
                break;
            case 4:
                System.out.println("The currency of your denomination is yen.");
                System.out.println("The value is " + firstValue + " the cost for dollar is " + firstValue * Calculations.japanYen());
                newValue = firstValue * Calculations.japanYen();
                break;
            case 5:
                System.out.println("Exit");
                System.out.println("");
                break;
            default:
                System.out.println("Invalid input. Please enter 1-4.");
                //continue;
            
        }

        System.out.println("Enter 1-4 to identify the currency you want to convert into. 1 for dollar, 2 for pounds, 3 for euro, and 4 for yen.");
        int convertedCurrency = scanner.nextInt();

        switch (convertedCurrency) {
            case 1:
                System.out.println("The converted value to dollar is " + );
                break;
            case 2:
                System.out.println("The converted value to the british pound is " + newValue * Calculations );
                break;
            case 3:
                System.out.println("The converted value to euro is " + newValue * Calculations.euroDollar());
                break;
            case 4:
                System.out.println("The converted value to japanese yen is " + newValue * Calculations.japanYen());
                break;
            default:
                System.out.println("Session abort.");
                break;
        }





        
        
        
        
        scanner.close();
    }
    
    public static void pressAnyKeyToContinue() {
        System.out.println("Press enter to Continue.....");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }

}


