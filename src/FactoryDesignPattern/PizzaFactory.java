package FactoryDesignPattern;

import java.util.ArrayList;

/**
 * @author Mia Watts
 * PizzaFactory class that constructs a new Pizza subclass object depending on which type of
 * pizza the user has ordered.
 */
public class PizzaFactory {
    //DIRECTIONS.
    //Super class pizza - sub out to chicago style, new york style, and sicilian style
    //Write a class Factory. It will contain a switch statement that returns a construction
    //of one of those types of pizza.
    //Another class - constructs a pizza factory and asks the factory to construct pizzas for them.
        //Pizza hut has a pizza factory. "hey pizza factory, generate a sicilian pizza!"
            //calls ONLY the pizza factory object and pz.generate(sicilian) which will give that pizza.

    //GOAL - Pizza hut can ask a pizza factory to construct unique classes at runtime

    //Global variable that stores a pizza of type Pizza.
    private Pizza pizza;
    private ArrayList<Double> totalCost;

    /**
     * PizzaFactory constructor that initializes the Pizza object.
     */
    public PizzaFactory() {
        pizza = new Pizza();
        totalCost = new ArrayList<>();
    }

    /**
     * Generator method that generates a Pizza object (New York, Sicilian, Chicago, etc.) based on
     * what the parameter was that was passed to the method.
     * @param pizzaType - A written word that shows which pizza has been ordered.
     */
    public void generate(String pizzaType) {
        //Switch-case that determines which object should be made based on what was passed as a parameter.
        switch(pizzaType) {
            case "sicilian":
                Sicilian newSicilian = new Sicilian(15.99);
                System.out.println("You ordered a " + newSicilian.getName() +
                        " pizza! A Sicilian pizza object has been created. Price: " + newSicilian.getPrice());
                totalCost.add(newSicilian.getPrice());
                break;
            case "new york":
                NewYork newNewYork = new NewYork(12.0);
                System.out.println("You ordered a " + newNewYork.getName() +
                        " pizza! A New York style pizza object has been created. Price: " + newNewYork.getPrice());
                totalCost.add(newNewYork.getPrice());
                break;
            case "chicago":
                Chicago newChicago = new Chicago(14.0);
                System.out.println("You ordered a " + newChicago.getName() +
                        " pizza! A Chicago style pizza object has been created. Price: " + newChicago.getPrice());
                totalCost.add(newChicago.getPrice());
                break;
            default:
                System.out.println("That is not a valid pizza type. Enter a valid pizza type!");
        }
    }

    public double calculateCost() {
        double total = 0;
        for(int i = 0; i < totalCost.size(); i++) {
            total = total + totalCost.get(i);
        }
        return total;
    }
}
