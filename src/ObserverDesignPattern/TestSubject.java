package ObserverDesignPattern;

/**
 * @author Mia Watts
 * Tester class for the Observer Design Pattern. Adds users, creates users, removes users, and updates
 * users using the methods defined within the Subject class.
 */
public class TestSubject {
    public static void main(String[] args) {
        //CREATING NEW USERS.
        Subject mailingList = new Subject();
        Youths newPerson1 = new Youths();
        Seniors newPerson2 = new Seniors();
        Businesses business1 = new Businesses();
        Seniors newPerson4 = new Seniors();
        Youths newPerson5 = new Youths();
        Seniors business2 = new Seniors();

        //REGISTERING USERS.
        System.out.println("ADDING USERS...");
        System.out.println(mailingList.registerObserver(newPerson1, "Mia Watts"));
        System.out.println(mailingList.registerObserver(newPerson2, "Hailey Jensen"));
        System.out.println(mailingList.registerObserver(business1, "Spencer Gifts"));
        System.out.println(mailingList.registerObserver(newPerson4, "Kirsten Casey"));
        System.out.println(mailingList.registerObserver(newPerson5, "John Smith"));
        System.out.println(mailingList.registerObserver(business2, "IT Office") + "\n");

        //PRINTING OUT THE CURRENT MAILING LIST.
        System.out.println("CURRENT MAILING LIST:");
        System.out.println(mailingList + "\n");

        //UNREGISTERING USERS.
        System.out.println("REMOVING USERS...");
        System.out.println(mailingList.unregisterObserver(newPerson2) + "\n");

        //PRINTING OUT THE CURRENT MAILING LIST.
        System.out.println("CURRENT MAILING LIST:");
        System.out.println(mailingList + "\n");

        //NOTIFYING USERS.
        System.out.println("NOTIFYING USERS...");
        System.out.println(mailingList.notifyUsers());
    }
}
