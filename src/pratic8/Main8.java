package pratic8;

import pratic8.Person.Person;

import java.util.ArrayList;

public class Main8 {
    public static void main(String[] args) {
        var person = new Person();
        person.setName("Camila");
        person.setAge(34);

        var person2 = new Person();
        person2.setName("Rafael");
        person2.setAge(32);

        System.out.println(person);

        ArrayList<Person> namesPerson = new ArrayList<>();
        namesPerson.add(person);
        namesPerson.add(person2);

        System.out.println(namesPerson);

    }

}
