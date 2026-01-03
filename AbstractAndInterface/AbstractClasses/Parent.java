/*
Java does not support multiple inheritance as if a class is inheriting 2 or more than 2 classes
 and both of them have the same method,
 and now base class is trying to access a method it will get confused ki kis class ka method access kare?
 */
/*
Abstract classes will give u some parent class hat tell us what to do
and not how to do, fill the things as you want.

Abstract method is method that doesn't have but only the definition part
 child needs to do the implementation part
 if a class does not provide the method body then it will have to be abstract
 */
/*
They can have constructors as well
 */

/*
cannot create an abstract static method
but can create a static method in the abstract class.
 */

/*
u could not make them final as final classes could not be overridden, and abstract classes not to be overridden
 */

// u cannot create abstract constructors, and abstract class need to have least 1 abstract method

//can have static variable and final variable as well.
public abstract class Parent {
protected  String name ;
int age ;
float salary =23500f;
// I totally forgot, either static or final we could create a block to initialize them.
static int population=230000000;
final String SEX = "female" ;


public  Parent(String name ,int age){
    this.name = name;
    this.age=age;
}
    abstract void carrer(String career);
static  void staticMethodInAbstract(){
    System.out.println("I am a static method in the abstract class.");
}
void normalMethodInAbstract(){
    System.out.println("Just a normal method in the abstract class");
}
}
