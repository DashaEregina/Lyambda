public class Person {
    private final String name;
    private final String surname;
    private final int age;

    // создайте конструктор на все поля
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // создайте геттеры и сеттеры
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    // создайте toString
    @Override
    public String toString() {
        return name + ", " + surname + ", " + age +"\n";
    }
}