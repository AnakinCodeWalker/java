package Dynamic_Polymorphism;
// every class extends the object class so we could do overriding everywhere. without using the extends keyword
public class Main {
    public static void main(String[] args) {
        Base base = new Base();
        base.greet();

//      Dynamic method dispatch -- this is how we are able to do runtime polymorphism
        Base child = new Child();
//       the child will be called { overrided method }
        child.greet();

        Child child1 = new Child();
        child1.greet();
    }
}
