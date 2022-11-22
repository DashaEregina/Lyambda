import java.util.Comparator;

public class PersonComp implements Comparator<Person> {
    private final int maxLen;

    public PersonComp(int maxLen) {
        this.maxLen = maxLen;
    }

    @Override
    public int compare(Person p1, Person p2) {
        int len1 = Math.min(p1.getSurname().split("[ -]").length, maxLen);
        int len2 = Math.min(p2.getSurname().split("[ -]").length, maxLen);
        if (len1 != len2) {
            return Integer.compare(len1, len2);
        }
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}