package warfare;

/**
 * Created by ronald on 02/10/16.
 */
public class Gunship {
    public static void main(String[] args) {

        String gun = "Tank";
        System.out.println("Tank" == gun);
        System.out.println("Tank".equals(gun));
        /*
        Prints true, but why? Here the string object is created and stored in a pool.
        JAVA looks around in this pool and finds no match, but then creates a similar one and says:
        "Hey these guys are the same, therefore this is true."

        In Java language: all the variables refer to the same String objects in the pool of String objects.
         */

        String gunTwo = new String("Tank");
        System.out.println("Tank" == gunTwo);
        System.out.println("Tank".equals(gunTwo));
        /*
        Using == Prints false, but why? JAVA looks at the reference variable, not at the string value. It actually
        looks around and finds a bucket called "gunTwo" containing the string "Tank". It the creates another bucket called
        "GunTwo", containing the string "Tank". Now when you use == Java says: "Hell, these buckets ar'nt the same thing.
        They look alike, but float around on different rafts withing the pool. But when you use .equals, JAVA looks
        at them as the same thing and prints true.

         In Java language: the variables refer to different string objects.
         */
    }
}
