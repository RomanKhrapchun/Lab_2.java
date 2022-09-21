package Task_2;

import java.util.List;
import java.util.Map;
import java.time.LocalDate;
public class Subject {
    private String subject;
    private Map<Student, Integer> mark;
    private List<LocalDate> date;

    public Subject(String subject, Map<Student, Integer> mark, List<LocalDate> date) {
        this.subject = subject;
        this.mark = mark;
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
                "subject='" + subject + '\'' +
                ", mark=" + mark +
                ", date=" + date +
                '}';
    }
}
