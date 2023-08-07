package Seminar_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate dateBirth;
    private String phoneNumber;
    private char gender;

    public void setData(String lastName, String firstName, String middleName, LocalDate dateBirth, String phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String dateBirthString = dateBirth.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return String.format("<%s><%s><%s><%s><%s><%s>", lastName, firstName, middleName, dateBirthString, phoneNumber, gender);
    }
}
