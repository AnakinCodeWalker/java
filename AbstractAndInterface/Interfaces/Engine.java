/*
-> in interface call the static method /fields by class name

-> these are like classes but u can not create objects of it.
-> they dont have constructor as well
-> so by default fields are static and final as they can not create objects  so static and they need to intialized before using so final 

-> fields static + final.

-> lets u do multiple inheritance.

-> from java 8 they can have private method  , static method and default method with body as well

-> This have static and final variable 

-> by default fields  and methods are public 

-> can have private method but can only be used inside the interface.

-> Abstract class  can provide the implementation of interface but vice versa is not true.
*/ 
public interface Engine{
// method and fields are by default   public .
    //fields by default are public static final variable
    Float PRICE = 50.0000f;
    
   
    // by default methods are public
default void carName  (String name){
System.out.println("Car Name is "+name);
}

void start();

 static void stop(){
    System.out.println("The car has stopped");
}

void brake();
void acc();

}