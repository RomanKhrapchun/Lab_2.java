package Task_3.service;

import Task_2.Group;
import Task_2.Student;
import Task_2.Subject;
import Task_2.University;

public class ServiceInfo {
    public University university;

    public ServiceInfo(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Subject getSubject(final String groupName, final String subjectName){
        for(final Subject subject : getGroup(groupName).getSubject()){
          if(subject.getName().equals(subjectName)) {
            return subject;
          }
        }
        return null;
    }

    public Group getGroup(final String groupName){
        for(final Group group : university.getGroup()){
            if(group.getGroup().equals(groupName)){
                return group;
            }
        }
        return null;
    }

    public Student getStudent(final Student getStudent){
        for(final Group groupName : university.getGroup()){
            for(final Student student : groupName.getStudents()){
                if(student.getStudentName().equals(getStudent)){
                    return student;
                }
            }
        }
        return null;
    }

    public Student getStudentByName(final String studentName){
        for(final Group groupName : university.getGroup()){
            for(final Student student : groupName.getStudents()){
                if(student.getStudentName().equals(studentName)){
                    return student;
                }
            }
        }
        return null;
    }
}
