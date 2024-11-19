package ObserverDesignPattern;

/**
 * @author Mia Watts
 * This class represents businesses such as Spencer Gifts, Target, etc., that may be a part of
 * a general mailing list for large corporate offices. The class implements the Observer interface.
 */
public class Businesses implements Observer {
    //Global variable that stores the name of the user which would be the business in this class.
    private String userName;

    /**
     * Prints the result of updating a user. Comes from the update method defined in the interface.
     */
    public void update() {
        System.out.println("Business " + this.getName() + " has been updated.");
    }

    /**
     * Setter method defined in the interface that sets a name of a business to a new, user defined name.
     * @param name - The new name of the user that will replace the old one.
     */
    public void setName(String name) {
        userName = name;
    }

    /**
     * Getter method defined in the interface that returns a user's name.
     * @return the user's name, which in this case would be the business name.
     */
    public String getName() {
        return userName;
    }
}
