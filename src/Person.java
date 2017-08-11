public class Person implements Comparable<Person> {
    private String name, nationality;
    private int points;

    public int getPoints() { return points; }
    public String getName() { return name; }
    public String getNationality() { return nationality; }

    public Person(String nationality, String name) {
        this.name = name;
        this.nationality = nationality;
    }

    public void addPoint() { ++points; }

    public int compareTo(Person o) {
        if (o == null) { throw new NullPointerException("Parameter is null reference."); }
        return this.points - o.points;
    }
}
