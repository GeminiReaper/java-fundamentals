package model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDateTime dob;
    private String number;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDateTime dob, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                dob.equals(person.dob) &&
                Objects.equals(number, person.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dob, number);
    }

    @Override
    public String toString() {
        return "Person:{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", number='" + number + '\'' +
                '}';
    }
}
