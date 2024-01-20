package software;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate nacimiento;

    public Person(String name, LocalDate nacimiento) {
        this.name = name;
        this.nacimiento = nacimiento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nacimiento=" + nacimiento +
                '}';
    }
}
