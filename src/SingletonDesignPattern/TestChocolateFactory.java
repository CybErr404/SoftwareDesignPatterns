package SingletonDesignPattern;

/**
 * @author Mia Watts
 * Tester class for the Singleton Design Pattern ChocolateFactory implementation.
 */
public class TestChocolateFactory {
    public static void main(String[] args) {
        //Prints the value of the global candyBar variable that previously couldn't be accessed.
        //The ChocolateFactory object can be called directly because of its static keyword.
        //In this statement, the result of the ChocolateFactory instance's value is printed into the console.
        System.out.println(ChocolateFactory.getInstance().getCandyBar());
    }
}
