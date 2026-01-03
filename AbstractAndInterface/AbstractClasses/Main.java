public class Main {
    public static void main(String[] args) {
        Son obj = new Son("Maurya",23);
        obj.carrer("Doctor");

//        Accessing the Static method in the abstract class.
        Parent.staticMethodInAbstract();

//       normal method in the abstract class.
        obj. normalMethodInAbstract();
    }
}
/*
 -> can u create static abstract methods?
 abstract methods are those methods that need to be overridden, but static methods cannot be overridden
 because they depend on the class itself and not the object so , we can not make them static.
 */