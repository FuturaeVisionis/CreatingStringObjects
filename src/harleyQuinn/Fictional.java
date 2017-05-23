package harleyQuinn;

/**
 * Created by ronald on 02/10/16.
 */
public class Fictional {
    public static void main(String[] args) {
        String suicideSquad = "Harley Quinn";
        /*
        Now we can not change the string literal (object) "Harley Quinn". A common thinking mistake is that if I
        assign a different string literal to the reference variable suicideSquad, I have changed the string object.
        This is not correct! Java executes your change, but that is not due to the fact that you were able to change
        the object! It is because the JVM runs the StringBuffer behind the scenes. You see, the StringBuffer IS MUTABLE!

        Okay, but what happens to the object "Harley Quinn" now? Well, she gets garbage collected. The StringBuffer has
        created a new object on the heap memory ("Harely Qinn is hot!) The object "Harely Quinn" that was created on the
        method memory, now gets cleaned up.
         */
        suicideSquad = suicideSquad + " is hot!";
        /*
        Behind the scenes, JAVA invokes the StringBuffer:
        suicideSquad = new StringBuffer("Harley Quinn").append(" is hot!").toString();
         */
        System.out.println(suicideSquad);
    }
}
