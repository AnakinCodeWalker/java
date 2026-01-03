// Multilevel inheritance.
public class BoxPrice  extends  BoxWeight{
    double cost;
// put variable according to the number of variable that are going to be present in the super classes.
    public BoxPrice(double l,double h,double w, double weight ,double cost){
//        above this we 2 classes hai in total 4 variables hai
   super(l,h,w,weight); //super() calls the constructor that is just above it
/*
        this will call the BoxWeight ka constructor from there BoxWeight
        super() will call Box and fields will get its values accordingly.
        */
/*
This will class just above it, and from there the class above it will
 be called, and the field will be accessed.
 */
        System.out.println("Accessing the Super class ka Super variable "+super.l);
 this.cost = cost;
    }

}
