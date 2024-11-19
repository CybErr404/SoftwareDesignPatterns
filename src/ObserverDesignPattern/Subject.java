package ObserverDesignPattern;

//Import statement for the ArrayList class which is used to store a list of users.
import java.util.ArrayList;

/**
 * Subject class that implements necessary methods for registering and removing users and updating
 * them depending on certain characteristics.
 */
public class Subject {
    //Global variable that stores a list of users, all of type Observer.
    private ArrayList<Observer> observerCollection;

    /**
     * Unfilled constructor that initializes the ArrayList that will hold the users.
     */
    public Subject() {
        observerCollection = new ArrayList<>();
    }

    /**
     * String registration method that adds new users to the list of observers.
     * @param observer - The object that defines the type of user.
     * @param name - The name of the user.
     * @return a statement that confirms a specific user has been added to the list, getting the name
     *         from the getName() method defined in the interface.
     */
    public String registerObserver(Observer observer, String name) {
        observer.setName(name);
        observerCollection.add(observer);
        return "User " + observer.getName() + " has been added.";
    }

    /**
     * String remover method that removes a specific user from the list of observers. Simulates
     * unregistering a user.
     * @param observer - The object that defines the type of user.
     * @return a statement that confirms a specific user has been removed from the list, getting the
     *         name from the getName() method defined in the interface.
     */
    public String unregisterObserver(Observer observer) {
        if(observerCollection.contains(observer)) {
            observerCollection.remove(observer);
            return "The following user has been removed: " + observer.getName();
        }
        else {
            return "This user is not currently in the mailing list.";
        }
    }

    /**
     * Notifies users depending on their position in the ArrayList.
     * @return a statement that confirms a user has been updated or notified and returns the number of
     *         users that have been updated.
     */
    public String notifyUsers() {
        int count = 0;
        for(int i = 0; i < observerCollection.size(); i++) {
            if(i % 2 == 0) {
                observerCollection.get(i).update();
                count++;
            }
        }
        return "Users have been updated! Total number of users updated: " + count;
    }

    /**
     * String toString() method that overrides the original toString() method. Used to print out the
     * current list of users in the observer list.
     * @return a String result that shows the users contained within the list.
     */
    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < observerCollection.size(); i++) {
            if(i == observerCollection.size() - 1) {
                result = result + observerCollection.get(i).getName();
            }
            else {
                result = result + observerCollection.get(i).getName() + ", ";
            }
        }
        return result;
    }
}
