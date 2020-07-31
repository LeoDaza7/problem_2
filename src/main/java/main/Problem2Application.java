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
        final int earthRadiusInMeters = 6371000;
        final int classroomCenterToEdgesMinDistance = 10;
        final int ONE = 1;
        final int TWO = 2;
        final double classroomCenterToEdgesMaxDistance = Math.sqrt(Math.pow(classroomCenterToEdgesMinDistance,TWO) * TWO);
        final double distanceBetweenLatitudes = Math.toRadians(student.getLatitude() - classroom.getLatitude());
        final double distanceBetweenLongitudes = Math.toRadians(student.getLongitude() - classroom.getLongitude());
        final double a = Math.sin(distanceBetweenLatitudes/TWO) * Math.sin(distanceBetweenLatitudes/TWO)
                + Math.cos(Math.toRadians(classroom.getLatitude()) * Math.cos(Math.toRadians(student.getLatitude())))
                * Math.sin(distanceBetweenLongitudes/TWO) * Math.sin(distanceBetweenLongitudes/TWO);
        final double c = TWO * Math.atan2(Math.sqrt(a), Math.sqrt(ONE-a));
        final double distanceBetweenClassroomCenterAndStudent = earthRadiusInMeters * c;
        return (distanceBetweenClassroomCenterAndStudent <= classroomCenterToEdgesMaxDistance);
    }

}
