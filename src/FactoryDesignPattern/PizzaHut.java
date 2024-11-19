package FactoryDesignPattern;

/**
 * @author Mia Watts
 * PizzaHut class represents a restaurant that is taking batch orders.
 */
public class PizzaHut {
    /**
     * Run method that runs the batchOrder() method and prints out a welcome statement when the
     * customer enters (i.e., when the program is run).
     */
    public void run() {
        System.out.println("Welcome to Pizza Hut!");
        batchOrder();
    }

    /**
     * Order method that takes a bunch of pizza orders and generates the objects for those pizzas
     * using the PizzaFactory's generate() method.
     */
    public void batchOrder() {
        PizzaFactory order = new PizzaFactory();
        order.generate("sicilian");
        order.generate("new york");
        order.generate("chicago");
        order.generate("fjesiogjrougjr");
    }

}
