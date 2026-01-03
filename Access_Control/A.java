public class A {
/*
  every field or method that is private u can
   access it in the same file
 */

    public   int num;
    public String name ;
    int []arr ;

//    u could actually access the private variables by getters and getters
    private int salary ;

    public  A(int num,String name){
        System.out.println("accessing before initializing " + this.num);
        this.num=num ;
        this.name =name;
/*
if u put this.num it will access the instance variable whose
value initialized ho gyi hai just before, we are using it

if we do num, it will have the variable passed into the constructor
 */
        this.arr = new int[this.num];
        System.out.println("Accessing after initializing " + this.num);
        System.out.println("Accessing the  variable of the constructor " + num);
    }

    //    as this method[getter and setter] is public, we could access them, and via this we could access the private fields.
    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void privateCallingMethod(){
        greet();
    }
    private  void greet(){
        System.out.println("I am the private method.");
    }

}
