package Task_4;

import Task_2.Task_2;
import Task_2.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_4 {
    public static void main(String[] args) {
        final List<Group> groups = new ArrayList<>();
        final String groupName1 = "IT-21";
        final String speciality1 = "Java for beginners";
        final List<Student> students1 = Stream.of(
                new Student("Roman Khrapchun", speciality1, groupName1),
                new Student("Arsen Lisnuchuk", speciality1, groupName1),
                new Student("Oleksandr Hamayunov", speciality1, groupName1),
                new Student("Maksym Polapa", speciality1, groupName1)
        ).collect(Collectors.toList());
        groups.add(new Group(groupName1, students1, Stream.of(
                new Subject("Java for beginners", new HashMap<Student, Integer>(){{
                    put(students1.get(0), 98);
                    put(students1.get(1), 100);
                    put(students1.get(2), 99);
                    put(students1.get(3), 98);
                }}, Stream.of(
                        LocalDate.of(2022, 11, 1),
                        LocalDate.of(2022, 11, 2)
                ).collect(Collectors.toList())
                ),
                new Subject("All about data", new HashMap<Student, Integer>(){{
                    put(students1.get(0), 98);
                    put(students1.get(1), 100);
                    put(students1.get(2), 99);
                    put(students1.get(3), 98);
                }}, Stream.of(
                        LocalDate.of(2022, 11, 3),
                        LocalDate.of(2022, 11, 4)
                ).collect(Collectors.toList())),
                new Subject("Practicical lessons", new HashMap<Student, Integer>(){{
                    put(students1.get(0), 98);
                    put(students1.get(1), 100);
                    put(students1.get(2), 99);
                    put(students1.get(3), 98);
                }}, Stream.of(
                        LocalDate.of(2022, 11, 5),
                        LocalDate.of(2022, 11, 6)
                ).collect(Collectors.toList())
                )
        ).collect(Collectors.toList())
        ));

        final String groupName2 = "IT-22";
        final String speciality2 = "Mathematic";
        final List<Student> students2 = Stream.of(
                new Student("Roman Khrapchun", speciality2, groupName2),
                new Student("Arsen Lisnuchuk", speciality2, groupName2),
                new Student("Oleksandr Hamayunov", speciality2, groupName2),
                new Student("Maksym Polapa", speciality2, groupName2)
        ).collect(Collectors.toList());
        groups.add(new Group(groupName2, students2, Stream.of(
                new Subject("Higher mathematics", new HashMap<Student, Integer>(){{
                    put(students2.get(0), 100);
                    put(students2.get(1), 111);
                    put(students2.get(2), 100);
                    put(students2.get(3), 99);
                }}, Stream.of(
                        LocalDate.of(2022, 12, 1),
                        LocalDate.of(2022, 12, 2),
                        LocalDate.of(2022, 12, 3)
                ).collect(Collectors.toList())
                ),
                new Subject("Probability theory", new HashMap<Student, Integer>(){{
                    put(students2.get(0), 100);
                    put(students2.get(1), 111);
                    put(students2.get(2), 100);
                    put(students2.get(3), 99);
                }}, Stream.of(
                        LocalDate.of(2022, 12, 4),
                        LocalDate.of(2022, 12, 5)
                ).collect(Collectors.toList()))
        ).collect(Collectors.toList())
        ));

        final University university = new University("Novovolynsk University", groups);
        System.out.println(university);
        final Journal journal = new Journal(university, "Roman Khrapchun");
        System.out.println("All marks [ " + journal.getBySubject("Java for beginners", university) + " ];");

        System.out.println("Students marks = [ " + Journal.getByAllStudents(university) + " ];");
        System.out.println("One student marks = [ " + journal.getByStudent("Roman Khrapchun", university) + " ];");
        System.out.println("One subject marks = [ " + Journal.getBySubject("Java for beginners", university) + " ];");
    }
}
