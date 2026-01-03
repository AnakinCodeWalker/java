// importing inbuilt packages  
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    A obj = new A(5,"Ola");
        System.out.println( Arrays.toString(obj.arr) );

        System.out.println("Setting the Salary");
        obj.setSalary(10000);
        System.out.println("Accessing private field via getter "+ obj.getSalary());
        /*
        if u call the private method directly, this will give u an error u.
        cannot access them directly but u can use a public method
       inside it u could call the private method
       */
        obj.privateCallingMethod();
    }
}
