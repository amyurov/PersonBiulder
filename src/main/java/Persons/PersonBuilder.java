package Persons;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0 && age < 150)
            this.age = age;
        else
            throw new IllegalArgumentException("Некорректный возраст");
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (null == name || null == surname)
            throw new IllegalStateException("Заполните обязательные поля");
        else if (address == null)
            return new Person(name, surname, age);
        else
            return new Person(name, surname, age, address);
    }
}
