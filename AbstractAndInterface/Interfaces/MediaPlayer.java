// top level interfaces could be public and package private
// nested interfaces could be public ,private ,protected ,default.
interface MediaPlayer extends Brake{

    void start();
    default void stop(){
System.out.println("I will stop the music");
    }
}

// abstract method no issue
// default need to be overridden .