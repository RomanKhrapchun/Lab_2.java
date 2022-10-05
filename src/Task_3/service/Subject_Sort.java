package Task_3.service;

import Task_2.Group;
import Task_2.University;
import Task_2.Subject;

public class Subject_Sort extends ServiceInfo{
    public Subject_Sort(University university) {
        super(university);
    }

    public void SortBySubject(final String nameSubject) {
        for (final Group group : university.getGroup()) {
            final Subject subject = getSubject(group.getGroup(), nameSubject);
            if(subject != null){
                subject.getMark().keySet().forEach(System.out::println);
            }
            else System.out.println("No such subject");
        }
    }
}
