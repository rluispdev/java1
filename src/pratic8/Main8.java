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

        var person3 = new Person();
        person3.setName("Neymar");
        person3.setAge(29);

        System.out.println(person);

        ArrayList<Person> namesPerson = new ArrayList<>();
        namesPerson.add(person);
        namesPerson.add(person2);
        namesPerson.add(person3);

        System.out.println(namesPerson.get(0).getName());
        System.out.println("Tamanho da lista: " + namesPerson.size());

        System.out.println("Lista de Pessoas:");
        for (Person person1 : namesPerson){
            System.out.println(person1);
        }

    }
}
