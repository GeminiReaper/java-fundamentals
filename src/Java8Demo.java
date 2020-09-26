import java.util.concurrent.Callable;

public class Java8Demo {
    /*
     * (An interface with single abstract method is called functional interface
     */
    interface FunctionalInterface {

        // abstract function
        void abstractFunction(int x);

        // non-abstract default function
        default void normalFunction() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        /******************************************
            Lambda Expression Examples
            Def: Like a method without a class.
             it is called an anonymous function.
            Purposes:
            1. enable us to treat functionality as a method argument,
            or code as data.
            2. A function that can be created without belonging to any class
            3. a lambda expression can be passed around as if it was an object
            and executed on demand.

            Lamnbda Syntax
            (Lambda Operator) -> {Lambda Body/ Statements}
         *******************************************/

        FunctionalInterface fint = (x) -> System.out.println( x * x);
        fint.abstractFunction(8); // Outputs: 64

        // Type inferencing: Being able to figure out the target data type from left side

        // Lambda Operators
        Runnable run =  () -> System.out.println("This is a Lambda expression example");

    }
}
