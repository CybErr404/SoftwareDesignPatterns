package FactoryDesignPattern;

/**
 * @author Mia Watts
 * New York class that extends Pizza. This class is a subclass of pizza, as New York is a Pizza.
 */
public class NewYork extends Pizza {
    //Global variable that stores the name of the pizza.
    private String name;

    /**
     * Constructor that initializes the name of the pizza to be New York.
     */
    public NewYork() {
        name = "New York";
    }

    /**
     * Getter method that returns the name of the pizza for printing purposes.
     * @return the name of the pizza.
     */
    public String getName() {
        return name;
    }
}
