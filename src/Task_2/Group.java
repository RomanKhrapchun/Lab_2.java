package Task_2;

import java.util.List;
public class Group {
    private String group;
    private List<Student> students;
    private List<Subject> subjects;

    public Group(String group, List<Student> students, List<Subject> subjects) {
        this.group = group;
        this.students = students;
        this.subjects = subjects;
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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group='" + group + '\'' +
                ", students=" + students +
                ", subjects=" + subjects +
                '}';
    }
}
