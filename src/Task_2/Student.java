package Task_2;

import java.util.Objects;
public class Student {
    private String name;
    private String specialty;
    private String group;

    public Student(String name, String specialty, String group) {
        this.name = name;
        this.specialty = specialty;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(getName(), student.getName()) && Objects.equals(getSpecialty(), student.getSpecialty()) && Objects.equals(getGroup(), student.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSpecialty(), getGroup());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
