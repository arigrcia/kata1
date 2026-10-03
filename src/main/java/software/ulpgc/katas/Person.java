package software.ulpgc.katas;

import java.time.LocalDate;

public class Person {
    public static final double DAYS_PER_YEARS = 365.25;
    public  String name;
    public LocalDate birthday;

    public Person(String name,  LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public int getAge(){
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay())
    }

    private int toYears(long days) {
        return (int) (days / DAYS_PER_YEARS);
    }

}
