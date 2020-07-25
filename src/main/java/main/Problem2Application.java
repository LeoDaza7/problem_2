package main;

import entities.Classroom;
import entities.Student;
import java.util.ArrayList;
import java.util.List;

public class Problem2Application {

    public static List<Student> studentFoundList(List<Student> studentList, List<Classroom> classroomList) {
        List<Student> studentFoundListTemp = new ArrayList<>();
        studentList.stream().forEach(student -> classroomList.stream()
                .forEach(classroom -> {
                    if(studentInClass(student,classroom)){
                        studentFoundListTemp.add(student);
                    }
                })
        );

        return studentFoundListTemp;
    }

    public static boolean studentInClass(Student student, Classroom classroom) {
        return false;
    }

}
