import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        will call the constructor that takes 0 args
        Box box0 = new Box();
        System.out.println("Printing the box0 with 0 args");
        System.out.println(box0.l + " " + box0.h + " " + box0.w);

//        will call the constructor that takes 1 args
        Box box1 = new Box(4);
        System.out.println("Printing the box1 with 1 args");
        System.out.println(box1.l + " " + box1.h + " " + box1.w);

//        will call the constructor that takes 3 args
        Box box = new Box(1, 2, 3);
        System.out.println("Printing the box with All args");
        System.out.println(box.l + " " + box.h + " " + box.w);


// This will call the parameterized constructor of the parent class internally.
        BoxWeight boxWeight3 = new BoxWeight(1,2,3,4);//it will check ki konsa constructor hai super/parent class ka joki internally takes 3 value it will call them
        System.out.println("Accessing the Base class via the  child class");
        System.out.println(boxWeight3.l+" "+ boxWeight3.h+" "+boxWeight3.weight);

        BoxWeight boxWeight = new BoxWeight(2);
        System.out.println(boxWeight.l+""+ boxWeight.h+" "+ boxWeight.w+" "+boxWeight.weight);

//        Dynamic method dispatch.
//        Parent class reference variable child class object
    Box boxObject = new BoxWeight(2);
/*
    it is a type of reference variable and not the object which Decides what
    variable/members can be accessed
                */
        System.out.println("Dynamic Method Dispatch");
        System.out.println(boxObject.h+" "+ boxWeight.l+" "+boxWeight.w);
/*
        now if u try to access a variable inside the child class if
        the reference is of parent class with give u an error.
        System.out.println(boxObject.weight);
*/

        BoxPrice boxPrice = new BoxPrice(4,5,6,7,8);
        System.out.println(boxPrice.l+" "+boxPrice.h+" "+boxPrice.w+" "+ boxPrice.weight+" "+ boxPrice.cost);
    }
}