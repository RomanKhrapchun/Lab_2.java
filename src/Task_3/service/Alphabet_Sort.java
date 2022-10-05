package Task_3.service;

import Task_2.Student;
import Task_2.University;

import java.util.List;
import java.util.Comparator;
public class Alphabet_Sort extends ServiceInfo{
    public Alphabet_Sort(University university) {
        super(university);
    }
    public void SortByName(final String groupName) {
        final List<Student> students = getGroup(groupName).getStudents();
        students.sort(Comparator.comparing(Student::getStudentName));
        students.forEach(System.out::println);
    }
}
