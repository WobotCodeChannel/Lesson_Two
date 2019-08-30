/**
 * classes are blueprints for objects - they define what an object should KNOW, and what an object should DO.
 * most classes will be defined in their own file, and then called later on in the main method.
 * classes are declared with the "class" keyword.
 */
public class Example {
    /**
     * this line here makes a variable that holds text called exampleString. This is
     * something that every object made from this class will KNOW.
     * 
     * variables defined at the top of a class, and not inside of methods
     * are referred to as "instance variables".
     */
    String exampleString = "Hello!";

    /**
     * this line here makes a function that uses our favorite command, System.out.println(),
     * to write the contents of exampleString to the screen. This is an example of 
     * something that every object made from this class will DO.
     * 
     * In java, these functions are called methods.
     */
    public void greeting() {
        System.out.println(exampleString);
    }
}