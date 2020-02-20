import model.Person;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class JavaObjectsDemo {

    public static void main(String[] args) {

        //Object Class methods
        Person me = new Person("David", "Yoon", LocalDateTime.now(),"2153923982");
        Person me2 = me;
        Person me3 = new Person("David", "Yoon", LocalDateTime.now(),"2153923982");

        Person someone = new Person("John", "Doe", LocalDateTime.now(), "2672344567");

        // toString()
        System.out.println("TOSTRING()");
        System.out.println("me -> toString(): " + me.toString());
        System.out.println("me2 -> toString(): " +  me2.toString());
        System.out.println("someone -> toString(): " +  someone.toString());

        //Hash Code -> Hash Tables ie Map collection
        Map<Person, String> peopleMap = new HashMap<>();
        System.out.println("\nHASHCODE");
        System.out.println("me -> hasCode(): " + me.hashCode());
        System.out.println("me2 -> hashCode(): " + me2.hashCode());
        System.out.println("me equals me3? " + me.equals(me3));
        System.out.println("me == me3? " + (me==me3));
        System.out.println("me3 -> hashCode(): " + me3.hashCode());
        System.out.println("someone -> hashCode(): " + someone.hashCode());

        peopleMap.put(me, me.toString());
        System.out.println("Map.get(): " + peopleMap.get(me));

    }
}
