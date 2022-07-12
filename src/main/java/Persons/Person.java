package Persons;

public class Person {

    private final String name;
    private final String surname;
    private int age;
    private String address;

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(address)
                .setAge(0);

    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        age = -1;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return age == -1 ? false : true;
    }

    public boolean hasAddress() {
        return address == null ? false : true;
    }

    public void happyBirthday() {
        this.age++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        if(!this.hasAge())
            System.out.printf("%s %s - возраст не определен%n", name, surname);
        return age;
        }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nВозраст: %s%nАдрес: %s%n", name, surname,
                hasAge() ? age : "не определен", hasAddress() ? address : "не определен");
    }
}
