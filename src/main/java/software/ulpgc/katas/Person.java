package software.ulpgc.katas;

import java.time.LocalDate;

public class Person {
    public static final double DAYS_PER_YEARS = 365.25;
    private String name;
    private LocalDate birthday;

    public Person(String name,  LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public LocalDate getBirthDate() {
        return birthday;
    }
    public int getAge() {
        return toYear(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYear(long day) {
        return (int) (day / DAYS_PER_YEARS);
    }

}

