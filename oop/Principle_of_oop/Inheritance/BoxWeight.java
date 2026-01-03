/*
in the constructor, if you're calling the super(),
 then count the total number of methods, and them put them into
 the constructor and put the necessary one into the super accordingly.
 */

//this will be the child class that will inherit the properties of the base class.
public class BoxWeight extends Box {
double weight ;

public  BoxWeight(double weight){
//constructor of parent class will be called accordingly as the number of parameters.
//  if a non-parameterized super constructor is present even u dont call it things will work
    super(); //if u don't pass any args, it will call the default constructor of the parent class
this.weight=weight;
}

    //        super() is used to  refer the constructor that is just above it.
//        or if you're in base class and want to access the variable, that are inside the parent class

//creating a parameterized constructor
// so these values will be passed from here to the parent constructor and eventually u,ll be accessing them
    public  BoxWeight(double l , double h, double w,double weight  ){
//       lets u initialize variables of the parent class from here it will call the parent constructor joki 3 values as args leta hai.
        super(l, h, w); //values from here will go to parent class constructor mai deejaying

        // System.out.println(super.h); this lets u access variable of the parent class same goes for the methods as well
        // use this keyword if u want  to access instance variable of child , use super you want to do it for super.

       this.weight=weight;
    }

//    constructors are executed in the order they are written
//    it is necessary for the  super() to be the first in the child constructor.
}
