package singleton;

public class SingleObject {
    // Private static variable of the same class that is the only instance of the class
    private static SingleObject instance;

    // Private constructor to restrict instantiation of the class from other classes
    private SingleObject() {
    }

    // global access point for outer world to get the instance of the singleton class
    public static SingleObject getInstance() {
        if(instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("I am singleton class !!");
    }
}
