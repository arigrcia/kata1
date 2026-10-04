package software.ulpgc.katas;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Person lola = new Person("Lola", LocalDate.of(1999, 9, 27));
        System.out.println(lola.getName() + " tiene " + lola.getAge() + " años");
    }
}

