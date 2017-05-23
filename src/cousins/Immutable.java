package cousins;
/**
 * Created by ronald on 02/10/16.
 */
public class Immutable {

    // Still don't believe String object are immutable! Check this out:

    public static void main(String[] args) {

    String cousinOne = "Tristan";
    String cousinTwo = "Tristan";

        System.out.println(cousinOne == cousinTwo);
        System.out.println(cousinOne.equals(cousinTwo));

        //now let's add some stuff to cousinTwo:

        cousinTwo += " Kneppers";
        System.out.println(cousinTwo);

        /*
        According to logic, if cousinOne is equal to cousinTwo then cousinOne should give:
        Tristan Kneppers, right! But it doesn't!!
         */
        System.out.println(cousinOne);
        // Ipso facto, STRING OBJECT ARE IMMUTABLE!!

        System.out.println("-------------------NOW USING THE OPERATOR------------------");

        String cousinThree = new String("Tristan");
        System.out.println(cousinThree);
        System.out.println(cousinThree.concat(" Kneppers"));
        System.out.println(cousinThree);
        /*
        Immutability is the fundamental property of string objects. In whatever way you create the
        string objects, either using string literals or using the NEW operator, they stay IMMUTABLE.
         */
    }
}
