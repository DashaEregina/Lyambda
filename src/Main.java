import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Person> isNot18yo = (p)->p.getAge()<18;
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("Кирилл", "Лесиков", 25);
        Person p2 = new Person("Александр", "Берестов", 31);
        Person p3 = new Person("Иван", "Туров", 47);
        Person p4 = new Person("Антон", "Прокопьев", 27);
        Person p5 = new Person("Алексей", "Ефимов", 22);
        Person p6 = new Person("Юрий", "Березин", 34);
        Person p7 = new Person("Даниил", "Георгиев", 23);
        Person p8 = new Person("Павел", "Гончаров", 37);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);
        people.add(p8);
        people.sort(new PersonComp(5));
        people.removeIf(isNot18yo);
        System.out.println(people);
    }
}
