package homeworcs.medicalCenter.doctorsAndPatients;

import java.util.Objects;

public class Person {
    private String id;
    private String name;
    private String surname;
    private String email;
    private int phone;
    private String profession;
    private Doctor doctor;
    private String registerDateTime;

    public Person(String id, String name, String surname, int phone, Doctor doctor, String registerDateTime) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public Person() {
    }

    public Person(String id, String name, String surname, String email, int phone, String profession) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(String registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }



    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", profession='" + profession + '\'' +
                ", doctor=" + doctor +
                ", registerDateTime='" + registerDateTime + '\'' +
                '}';
    }

}
