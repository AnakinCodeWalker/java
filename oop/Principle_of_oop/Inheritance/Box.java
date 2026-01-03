public class Box {
double l ;
double h ;
double w ;

//u can only access private fields and methods inside this file not in the child class or some other file
private  double radius ;
// creating the Constructor
    public Box(){
//    super(); this will refer to the object class.

        this.l=-1;   //accessing the class variables.
        this.h=-1;
        this.w=-1;
    }
//    parametrized constructor
    public Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }
//    passing 3 parameters
public Box( double l , double h, double w){
this.l=l;
this.h=h;
this.w=w;
}
public void information(){
    System.out.println("Running the  Box");
}

}

    /*
     if you're calling the base class from a child class,
    it makes sense  when you're calling the constructor of base class u
    should also define the property of the base class
 -> if you're trying to access variable of parent from the child
  it needs to be initialized as well
     */

