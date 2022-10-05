package Task_3;

import Task_2.Subject;
import Task_2.*;
import Task_2.University;
import Task_3.service.Date;
import Task_3.service.Alphabet_Sort;
import Task_3.service.Subject_Sort;
import Task_3.service.AddSubject;

import java.time.LocalDate;

public class Task_3 {
    public static void main(String[] args) {
        final University university = Task_2.createUniversity();
        System.out.println(university);

        final AddSubject addSubject = new AddSubject(university);
        addSubject.String_Subject("Java for beginners", "IT-21");
        System.out.println(university);

        final Date dateService = new Date(university);
        dateService.date_Add("Java for beginners", "IT-21", LocalDate.of(2022, 9,25));
        System.out.println(university);

        final Alphabet_Sort nameOutput = new Alphabet_Sort(university);
        nameOutput.SortByName("IT-21");
        System.out.println();

        final Subject_Sort subjectOutput = new Subject_Sort(university);
        subjectOutput.SortBySubject("Java for beginners");
        System.out.println();
    }
}
