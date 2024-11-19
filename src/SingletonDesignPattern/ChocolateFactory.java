package SingletonDesignPattern;

/**
 * @author Mia Watts
 * This class is a representation of the singleton design pattern, one of the many software
 * design patterns utilized within object-oriented programming.
 * The program simulates a Chocolate Factory containing a candy bar global variable and a private
 * construtor which does not allow separate classes to access the value until two getter methods are
 * created that assist with candy bar access.
 */
public class ChocolateFactory {
    //Global variable that holds the name of a candy bar.
    private String candyBar = "Twix";
    //Static global variable that holds a ChocolateFactory object.
    private static ChocolateFactory factory = new ChocolateFactory();

    /**
     * Private ChocolateFactory constructor that prevents classes outside of this one from
     * accessing variables within the ChocolateFactory class.
     */
    private ChocolateFactory() {

    }

    /**
     * Getter method that returns the String value of the candyBar variable.
     * @return the value contained within the candyBar variable.
     */
    public String getCandyBar() {
        return candyBar;
    }

    /**
     * Static getter method that returns the instance of the ChocolateFactory object. This
     * method initializes the factory ChocolateFactory object if it is null and will return the object.
     * @return the factory object either initialized within the method or initialized outside of the
     *         method within the same ChocolateFactory class.
     */
    public static ChocolateFactory getInstance() {
        if(factory == null) {
            factory = new ChocolateFactory();
        }
        return factory;
    }
}
