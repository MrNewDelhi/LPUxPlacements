package Session_2;

    /*
    * Model
    *
    * View
    *
    * Controller
    *       Logical Operator
    *           1. Operators for Computation
    *           2. if/else and switch case for decision making
    *           3. loops for iteration
    *
    *           PS : For Controller, MODEL will be data provider
    *
    * */

public class Operators {
    public static void main(String[] args) {
        // Operators
        //  Arithmetic Operators
        //      +, -, *, /, %

        double amount = 3565.55;
        double tax = 0.18;
        double total = amount + (tax * amount);
        System.out.println("Total to pay : \u20b9" + total);

        int number = 10;
        int buckets = 3;
        int hashCode = number % buckets;
        System.out.println("HashCode for number " + number + " with bucket size of " + buckets + " is : " + hashCode);

        // Assignment Operator
        //  =,

        int eWallet = 500; // Assign operator to assign the value
        int myWallet = eWallet; // Value copy operation | Copy from Variable to Variable

        //eWallet = eWallet + 100;
        eWallet += 100; // Short Hand Expression
        System.out.println("eWallet is : " + eWallet);

        eWallet %= 7;   // eWallet = eWallet % 7; -> eWallet %= 7
        System.out.println("eWallet is : " + eWallet);

        // Increment and Decrement Operators
        // ++ and --
        // ++ increments by 1
        // -- decrements by 1

        int quantity = 1;
        quantity++; //postfix
        ++quantity; // prefix
        ++quantity;

        quantity--;

        System.out.println("Quantity is : " + quantity);
        System.out.println();

        //int value = quantity++; // copy the first and update quantity later i.e. the last copy of data
        int value = ++quantity; //  update quantity and copy the data into value i.e. the latest data
        System.out.println("Value is : " + value);
        System.out.println("Quantity is : " + quantity);

        eWallet = 300;

        // Conditional or Relational
        // >, <, <=, >=, ==, !=
        int cabFare = 300;
        System.out.println("Can I book a Cab ? " + (eWallet >= cabFare));

        int promoCode = 101;
        int promoCodeByUser = 201;
        System.out.println("Can I get a discount ? " + (promoCode == promoCodeByUser));

        // Logical Operators
        // &&, ||, !
        System.out.println("Can I book cab and get discount ? " + !((eWallet >= cabFare) && (promoCode == promoCodeByUser)));

        boolean isGPSEnabled = true;
        System.out.println("Is GPS enabled : " + !isGPSEnabled);
        System.out.println("Is GPS not enabled : " + isGPSEnabled);
    }
}
