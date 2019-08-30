public class Run {
    public static void main(String[] args) {
        /**
         * much like a blueprint, classes on their own don't do anything but say how something else is designed.
         * A blueprint for a building, for instance, contains information on what the building should look like and
         * things like how tall the building should be. That doesn't mean that the blueprint can be used as a building,
         * though, of course.
         * 
         * much like construction workers turn building building blueprints into a building,
         * we need to turn our blueprint, or class, into something - in this case, we call that
         * something an object.
         * 
         * to make an object, you use the class name as a keyword to tell java what
         * class you want to make into an object. We named our class Example, so we
         * say "Example [object name] = new Example();" to create an object out of our class.
         * 
         * we can make as many objects from one class as we want.
         */
        Example example = new Example();
        Example example2 = new Example();

        /**
         * now that we have an object made after the class, we can use the dot operator to access
         * things that it knows, and things that it does.
         */
        example.greeting();
        /**
         * since both example and example2 are made from the same class, they can both do the same things.
         */
        example2.greeting();
        // you can call methods as many times as you want
        example2.greeting();
    }
}