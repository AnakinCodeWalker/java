
public class Car implements Engine, Brake {
    
     @Override
    public void start() {
        System.out.println("I am starting the car");
    }

 @Override   
public void acc(){
System.out.println("I am Increasing the speed.");
}


// abstract method does not conflicts 
// if 2 interfce have same abstract method it does not conflict.
// default method conflict  happens in and need to be resolved.
@Override
public void brake(){
    System.out.println("I am Stopping the car");
}

}
