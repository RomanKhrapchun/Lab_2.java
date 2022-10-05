package Task_3.service;

import Task_2.Student;
import Task_2.Subject;
import Task_2.University;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class AddSubject extends ServiceInfo {
    public AddSubject(University university) {
        super(university);
    }
    public void Subject_Add(final String groupName, final Subject sub){
        getGroup(groupName).getSubject().add(sub);
    }

    public void String_Subject(final String subjectName, final String groupName){
        final Map<Student, Integer> map = new HashMap<>();
        final Subject subject = new Subject(subjectName, map, new ArrayList<>());
        Subject_Add(groupName, subject);
    }
}
