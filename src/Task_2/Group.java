package Task_2;

import java.util.List;
public class Group {
    private String group;
    private List<Student> students;
    private List<Subject> subject;

    public Group(String group, List<Student> students, List<Subject> subject) {
        this.group = group;
        this.students = students;
        this.subject = subject;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subjects) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group='" + group + '\'' +
                ", students=" + students +
                ", subjects=" + subject +
                '}';
    }
}
