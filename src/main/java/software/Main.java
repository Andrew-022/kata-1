package software;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Andrés", LocalDate.of(2002,01,22));
        System.out.println(person.toString());
    }
}
