package pratic11;

public class Title implements Comparable <Title> {

    private String name;

    public Title(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Filme: " + name;
    }

    @Override
    public int compareTo(Title other) {
         return name.compareTo(other.name);
    }
}
