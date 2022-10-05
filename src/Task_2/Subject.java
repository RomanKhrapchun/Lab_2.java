package Task_2;

import java.util.List;
import java.util.Map;
import java.time.LocalDate;
public class Subject {
    private String name;
    private Map<Student, Integer> mark;
    private List<LocalDate> date;

    public Subject(String name, Map<Student, Integer> mark, List<LocalDate> date) {
        this.name = name;
        this.mark = mark;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Student, Integer> getMark() {
        return mark;
    }

    public void setMark(Map<Student, Integer> mark) {
        this.mark = mark;
    }

    public List<LocalDate> getDate() {
        return date;
    }

    public void setDate(List<LocalDate> date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name = " + name + '\'' +
                ", mark = " + mark +
                ", date = " + date +
                '}';
    }
}
