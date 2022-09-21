package Task_2;

import java.util.List;

public class University {
    private String university;
    private List<Group> group;

    public University(String university, List<Group> group) {
        this.university = university;
        this.group = group;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "University{" +
                "university='" + university + '\'' +
                ", group=" + group +
                '}';
    }
}
