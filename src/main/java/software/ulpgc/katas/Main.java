package software.ulpgc.katas;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    static void main() {
        Person arianna = new Person("Arianna", LocalDate.of(1989, 12, 30));
        System.out.println(arianna.name() + "tiene" + arianna.age() + "años");
    }
}
