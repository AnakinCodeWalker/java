package Static_Polymorphism;
public class CompileTimePolyMorphism {
//achieved by Method overloading

// class can have method of the same name but,
// ordering+type of args must be diff then this will word
//   and the number of args is different
// Access specifier will not work in here
// example - compile time polyMorphism


/*
 java determines which method / constructor to call during the compile
  time when multiple method / constructor type is of the same type.
 */

    public int sum(int a , int b  , int c ){
        return a+b+c ;
    }
    public int sum(int a ,float b){
return (int) (a+b);
    }

    public int sum(float b ,int a){
        return (int) (b+a);
    }
    public int sum(float a ,float b){
        return (int) (a+b);
    }

//    u could do the same for the constructor as well u could refer the Inheritance code for a clear picture.
    public static void main(String[] args) {
       CompileTimePolyMorphism obj = new CompileTimePolyMorphism();
        System.out.println(obj.sum(1,2,3));
        System.out.println(  obj.sum(1 ,2.2f));
        System.out.println( obj.sum(3.1f ,2));
        System.out.println( obj.sum(2.8f ,7.5f));

    }
}
