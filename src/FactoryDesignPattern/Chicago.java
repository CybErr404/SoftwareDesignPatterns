package FactoryDesignPattern;

/**
 * @author Mia Watts
 * Chicago class that extends Pizza. This class is a subclass of pizza, as Chicago is a Pizza.
 */
public class Chicago extends Pizza {
    //Global variable that stores the name of the pizza.
    private String name;
    private double price;

    /**
     * Constructor that initializes the name of the pizza to be Chicago.
     */
    public Chicago() {
        name = "Chicago";
    }
    public Chicago(double newPrice) {
        price = newPrice;
    }

    /**
     * Getter method that returns the name of the pizza for printing purposes.
     * @return the name of the pizza.
     */
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
