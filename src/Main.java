import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student =new Student("tuan",20,"HN");
        Student student1 = new Student(" nam", 21, "HN");
        Student student2 = new Student("hung", 22,"HN");

        Map<Integer, Student> map = new HashMap< Integer, Student>();
        map.put(1, student);
        map.put(2,student1);
        map.put(3,student2);
        for (Map.Entry<Integer, Student> entry : map.entrySet()){
            System.out.println(entry.getKey()+ ". " + entry.getValue());
        }

        System.out.println( );
        Set<Student> set= new HashSet<Student>();
        set.add(student);
        set.add(student1);
        set.add(student2);
        for (Student st : set ){
            System.out.println(st.toString());
        }

    }
}
