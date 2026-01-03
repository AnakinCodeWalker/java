package Dynamic_Polymorphism;

public class Child extends Base {
//    this is also known as Run time polyMorphism
    @Override //annotation used to mark if this method is override or not
public  void greet(){
    System.out.println("Hi cutie to my  child");
}

// if anything except the body of the method is different method overriding will not work
//Access specifier can change
}
