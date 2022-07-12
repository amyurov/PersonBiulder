import Persons.*;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        mom.happyBirthday();
        System.out.println(mom);
        try {
            Person sister = new PersonBuilder()
                    .setName("Анна")
                    .setAge(31)
                    .setAddress("Сидней")
                    .build();
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            Person parent = new PersonBuilder()
                    .setName("Анна")
                    .setSurname("Вольф")
                    .setAge(-12)
                    .setAddress("Сидней")
                    .build();
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}