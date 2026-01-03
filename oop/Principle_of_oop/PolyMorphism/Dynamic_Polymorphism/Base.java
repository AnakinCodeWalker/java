/*
UPCASTING :- is assigning a child object to a parent reference, while
Dynamic Method Dispatch is calling the overridden child method at runtime
 using that reference [WHILE THE PROGRAM IS RUNNING JAVA DETERMINES THIS]
 Parent obj = new Child() ; --> upcasting
 calling the override method  using the reference during the run time
 obj.show() ; // Child show method will run.
 --> Dynamic Method Dispatch will not happen if a method is static
 because for overriding or Dynamic Method Dispatch u have to deal with
 an object but static methods don't belong to object they belong to class

 --> u can inherit them but not override
 Polymorphism will not be applied to instance variables.
 */
package Dynamic_Polymorphism;

// if anything except the body of the method is different method overriding will not work
//Access specifier can change
public class  Base {

      void greet(){
        System.out.println("Hi cutie from your parent");
    }
}


/*
WHAT IS EARLY AND LATE BINDING?
 */