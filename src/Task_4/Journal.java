package Task_4;

import Task_2.Subject;
import Task_2.Group;
import Task_2.Student;
import Task_2.University;
import Task_3.service.ServiceInfo;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Journal {
    private Student student;

    private University university;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Journal(final University university, final String studentName){
        final ServiceInfo service = new ServiceInfo(university);
        if(student != null) {
            this.student = service.getStudentByName(studentName);
        }
        Map<Student, Integer>mark = new HashMap<Student, Integer>();
        for (final Group group : university.getGroup()) {
            if (group.getStudents().contains(this.student)) {
                for (final Subject subject : group.getSubject()) {
                    mark.put(student, subject.getMark().get(this.student));
                }
            }
        }
    }

    public List<Integer> getBySubject(final University university, final Subject subjectName){
        final List<Integer> marks = new ArrayList<>();
        for (Group group : university.getGroup()){
            for (Subject subject : group.getSubject()){
                for (Map.Entry<Student, Integer> entry : subject.getMark().entrySet()){
                    if(entry.equals(subjectName)){
                        marks.add(entry.getValue());
                    }
                }
            }
        }
       return marks;
    }

    public Map<Student, Integer> getByStudent(final String studentName, final University university1) {
        final Map<Student, Integer> marks = new HashMap();
        for (Group group : university1.getGroup()) {
            for(final Student student_1 : group.getStudents())
            if (student_1.getStudentName().equals(studentName)) {
                for (Subject subject : group.getSubject()) {
                    for (Map.Entry<Student, Integer> entry : subject.getMark().entrySet()) {
                        if (entry.getKey().getStudentName().equals(studentName)) {
                            marks.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
            }
        }
        return marks;
    }

    public static Map<Student, Integer> getByAllStudents(final University university1){
        final Map<Student, Integer> mark = new HashMap<>();
        for (final Group group : university1.getGroup()) {
            for (final Subject subject : group.getSubject()) {
                for(Map.Entry<Student, Integer> entry : subject.getMark().entrySet())
                    mark.put(entry.getKey(), entry.getValue());
            }
        }
        return mark;
    }

    public static List<Integer> getBySubject(final String nameSubject, final University university) {
        final List<Integer> submarks = new ArrayList<>();
        for (final Group group : university.getGroup()) {
            for (final Subject subject : group.getSubject()) {
                if (subject.getName().equals(nameSubject)) {
                   submarks.addAll(subject.getMark().values());
                }
            }
        }
        return submarks;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "student=" + student +
                '}';
    }
}