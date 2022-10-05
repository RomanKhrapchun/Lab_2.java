package Task_3.service;

import Task_2.University;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Date extends ServiceInfo{

    public Date(University university) {
        super(university);
    }

    public void date_Add(final String subject, final String groupName, final LocalDate date){
        getSubject(groupName, subject).getDate().add(date);
    }

    public void addDate(final String nameGroup, final String nameSubject, final LocalDate date) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        addDate(nameGroup, nameSubject, date);
    }
}
