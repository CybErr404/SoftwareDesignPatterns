package ObserverDesignPattern;

/**
 * @author Mia Watts
 * This class represents senior citizens that are a part of a mailing list for recent deals. The
 * class implements the Observer interface.
 */
public class Seniors implements Observer {
    //Global variable that stores the name of the user which would be a senior citizen in this class.
    private String userName;

    /**
     * Prints the result of updating a user. Comes from the update method defined in the interface.
     */
    public void update() {
        System.out.println("Senior citizen " + this.getName() + " has been updated.");
    }

    /**
     * Setter method defined in the interface that sets a name of a senior citizen to a new, user
     * defined name.
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
