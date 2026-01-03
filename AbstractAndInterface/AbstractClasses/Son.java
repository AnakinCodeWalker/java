public class Son  extends Parent{
   /*
   now parent has 2 abstract methods either this class need to write the implementation part or
    make this class as abstract as well
            */
//    String name = "ravi" ;
//int salary = 230000;
    public Son(String name ,int age ){
        super(name,age);
    }
    @Override
    void carrer(String career) {
/*
        this will check ki base mai we have this field or not if yes then access it if not then
go up in the inheritance chain / parent class
            */
        System.out.println("Hi "+name);

/*
      it will check for the whole object, agar base class mai present then it will access it from there
       if not it will go up the chain, check in an object, if I remove salary from base and define into parent it will access from there
*/
        System.out.println("your salary will be "+this.salary);
        System.out.println("Base salary is "+salary);

        /*
          by using the super() i am explicitly mentioning ki I want to access the parent variable
          even if there is a variable in the child class with the same name.
        */
        System.out.println("u are "+super.age); // refer to parent class variable
        System.out.println("so , you could be a "+career);
    }

}
