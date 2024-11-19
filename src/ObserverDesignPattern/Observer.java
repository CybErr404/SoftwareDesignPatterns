package ObserverDesignPattern;

/**
 * @author Mia Watts
 * This is the Observer interface which contains three methods required by every class that
 * implements the interface. These methods assist with printing (setName() and getName()) and
 * user updates (update()).
 */
public interface Observer {
    //Void updater method that will be overridden in classes that implement this interface.
    void update();
    //Void setter method for the name of the observer.
    void setName(String name);
    //String getter method for the name of the observer.
    String getName();
}
