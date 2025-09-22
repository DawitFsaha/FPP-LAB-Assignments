package lab11.prob1;
import java.util.*;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> map = new HashMap<>();
        for (Student s : students) {
            Key key = new Key(s.getFirstName(), s.getLastName());
            map.put(key, s);
        }
        return map;
    }
}
