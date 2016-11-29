package jpmc;

import java.util.Optional;

/**
 * Created by lvdandan on 29/11/2016.
 */
public class OptionalExample {
    public static void main(String args[]) {
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println("full name is: " + fullName.isPresent());
        System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
    }
}
