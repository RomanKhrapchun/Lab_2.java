package Task_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_2 {
    public static University createUniversity() {

        final List<Group> groups = new ArrayList<>();
        final String groupName1 = "IT-21";
        final String speciality1 = "Applied programming";
        final List<Student> students1 = Stream.of(
                new Student("Roman Khrapchun", speciality1, groupName1),
                new Student("Arsen Lisnuchuk", speciality1, groupName1),
                new Student("Oleksandr Hamayunov", speciality1, groupName1),
                new Student("Maksym Polapa", speciality1, groupName1)
        ).collect(Collectors.toList());
        groups.add(new Group(groupName1, students1, Stream.of(
                new Subject("Java for beginers", new HashMap<Student, Integer>(){{
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
                    put(students2.get(1), 100);
                    put(students2.get(2), 001);
                    put(students2.get(3), 100);
                }}, Stream.of(
                        LocalDate.of(2022, 12, 1),
                        LocalDate.of(2022, 12, 2),
                        LocalDate.of(2022, 12, 3)
                ).collect(Collectors.toList())
                ),
                new Subject("Probability theory", new HashMap<Student, Integer>(){{
                    put(students2.get(0), 100);
                    put(students2.get(1), 100);
                    put(students2.get(2), 001);
                    put(students2.get(3), 100);
                }}, Stream.of(
                        LocalDate.of(2022, 12, 4),
                        LocalDate.of(2022, 12, 5)
                ).collect(Collectors.toList()))
        ).collect(Collectors.toList())
        ));

        return new University("Novovolynsk University", groups);
    }

    public static void main(final String[] args) {
        final University university = createUniversity();
        System.out.println(university);
    }
}
