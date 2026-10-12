package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person maria = new Person("Maria", LocalDate.of(1989, 5, 9));
        System.out.println(maria.name() + " tiene " + maria.age() + " años");
    }
}