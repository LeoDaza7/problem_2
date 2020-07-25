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
        final int earthRadius = 6371;
        final double classArea = Math.sqrt(Math.pow(10,2) * 2);
        double distanceBetweenLatitudes = Math.toRadians(student.getLatitude() - classroom.getLatitude());
        double distanceBetweenLongitudes = Math.toRadians(student.getLongitude() - classroom.getLongitude());
        double a = Math.sin(distanceBetweenLatitudes/2) * Math.sin(distanceBetweenLatitudes/2)
                + Math.cos(Math.toRadians(classroom.getLatitude()) * Math.cos(Math.toRadians(student.getLatitude())))
                * Math.sin(distanceBetweenLongitudes/2) * Math.sin(distanceBetweenLongitudes/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double distanceBetweenClassroomAndStudent = earthRadius * c * 1000;
        if (distanceBetweenClassroomAndStudent <= classArea){
            return true;
        } else {
            return false;
        }
    }

}
