package Session_2;

        /*
        *
        * Model :
        *       Single Value Container | Primitve Types
        *           Only one Value
        *               Integral
        *               Floating Point
        *               Character
        *               Boolean
        *       Multi Value Container | Reference Types
        *           More than one Value
        *               Homogeneous Data Storage
        *                   Arrays
        *                   String
        *                   Objects
        *               Heterogeneous Data Storage
        *                   Objects
        * View :
        * Controller :
        * Datatypes : To create a storage container we need to define the type of it.
        *   Integeral
        *       byte    : 8 bits
        *       short   : 16 bits
        *       int     : 32 bits
        *       long    : 64 bits
        *   Floating Point
        *       float   : 32 bits
        *       double  : 64 bits
        *   Character
        *       char    : 16 bits
        *   Logical
        *       Boolean : 8 bits [out of 8 bits only 1 bit is used]
        * */
public class DataTypes {
            // main method
            // from where the execution time begins
    public static void main(String[] args) {
            // Creational Statement : Create a storage container named as age | age (variable)
            // Store the data 35 in it | 35 (literal)
            // byte is the type of storage container which means allocate a storage of 8 bits
            byte age = 35;
            System.out.println("Age is : " + age);
            //age is 8 bits ,it is stored in the stack frame while 35 is 32 bits and it is stored in the constant pool

            // Update Statement :
            age = 40;
            System.out.println("Age is : " + age);

            // 8 bits -> 2 power 8 | 256 | 256/2 => -128 to 0 to 127
            //age = 128 (error)

            // Literal of size 32 bits is copied into 8 bits
            // Literal of size 32 bits is copied into 8 bits
            // It is taken care by the compiler automatically  --> Implicit DownCasting

            // We can do it ourself as well
            age = (byte) 128;
            System.out.println("Age is : " + age);

            // short is 16 bits
            short s = 120;

            // int is 32 bits
            int eWallet = 300;

            // L means to convert the 32 bits literal in 64 bits
            long phoneNumber = 9090901011L;

            // Upcasting
            // here 32 bits are copied into 64 bits
            long data = 200;

            // Downcasting
            // here 64bits are copied into 32 bits
            // we will get error in downcasting -> add a manual cast
            // but this can be a problem -> as we may lose the data
            int number = (int)data;

            // Floating Points : Decimal Value
            // float percentage = 75.7; // percentage -> 32 bits | 75.7 -> 64 bits
            float percentage = 75.7f;   // percentage -> 32 bits | 75.7 -> 32 bits
            double discount = 0.25;     // discount -> 64 bits | 0.25 -> 64 bits

            //Down Casting
            float pi = (float)3.14;
            //Up Casting
            double piAgain = pi;

            char ch = 65;
            ch = 'B';
            ch = '\u20b9';
            System.out.println("ch is : " + ch);

            char ch1 = '\u0907';
            char ch2 = '\u0936';
            char ch3 = '\u093E';
            System.out.println("ch1 is : " + ch1 + " ch2 is : " + ch2 + " ch3 is : " + ch3);

            //Try writing your name in native language

            boolean internet = true;
            internet = false;

            System.out.println("Is internet enabled : " + internet);

            // Primitve cannot store data
    }
}
