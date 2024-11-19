package FactoryDesignPattern;

/**
 * @author Mia Watts
 * Sicilian class that extends Pizza. This class is a subclass of pizza, as Sicilian is a Pizza.
 */
public class Sicilian extends Pizza {
    //Global variable that stores the name of the pizza.
    private String name;

    /**
     * Constructor that initializes the name of the pizza to be Sicilian.
     */
    public Sicilian() {
        name = "Sicilian";
    }

    /**
     * Getter method that returns the name of the pizza for printing purposes.
     * @return the name of the pizza.
     */
    public String getName() {
        return name;
    }
}
