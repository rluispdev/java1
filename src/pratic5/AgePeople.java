package pratic5;

public class AgePeople {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("O nome da pessoa é " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if( age >= 18) {
            System.out.println("Essa pessoa é maior de idade.");
        } else {
            System.out.println("Essa pessoa é menor de idade.");
        }
    }
}
