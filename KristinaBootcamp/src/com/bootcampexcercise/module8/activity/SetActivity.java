import java.util.HashSet;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        HashSet people = new HashSet<>();
        //Also try adding a few duplicate entries to this set.


        //TODO: 2 - Call print method to print the set passed as its parameter.

        people.add("Kristina");
        people.add("Sindy");
        people.add("Disha");
        people.add("Disha");
         // duplicate Disha
        System.out.println("Output: ");
        for (Object nameOfObject : people) {
            System.out.println(nameOfObject.toString());
        }
    }
}
