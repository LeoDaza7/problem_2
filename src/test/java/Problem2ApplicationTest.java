import entities.Classroom;
import entities.Student;
import main.Problem2Application;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2ApplicationTest {

    @Test
    public void testExample1(){

        Student johnWilson = new Student("John Wilson", 34.069149, -118.442639);
        Student janeGraham =  new Student("Jane Graham", 34.069601, -118.441862);
        Student pamBam = new Student("Pam Bam", 34.071513, -118.441181);
        Classroom principlesOfComputational =  new Classroom("Principles of computational geo-location analysis", 34.069140, -118.442689);
        Classroom sedimentaryPetrology = new Classroom("Sedimentary Petrology", 34.069585, -118.441878);
        Classroom introductoryPsychobiology = new Classroom("Introductory Psychobiology", 34.069742, -118.441312);
        Classroom artOfListening = new Classroom("Art of Listening", 34.070223, -118.440193);
        Classroom artHitory = new Classroom("Art Hitory", 34.071528, -118.441211);

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                johnWilson,
                janeGraham,
                pamBam
        ));

        List<Classroom> classroomList = new ArrayList<>(Arrays.asList(
                principlesOfComputational,
                sedimentaryPetrology,
                introductoryPsychobiology,
                artOfListening,
                artHitory
        ));

        List<Student> studentFoundList = Problem2Application.studentFoundList(studentList,classroomList);

        List<Student> actualStudentList = new ArrayList<>(Arrays.asList(
                johnWilson,
                janeGraham,
                pamBam
        ));

        Assert.assertEquals(actualStudentList,studentFoundList);

    }

    @Test
    public void testExample2(){

        Student johnWilson = new Student("John Wilson", 34.069849, -118.443539);
        Student janeGraham = new Student("Jane Graham", 34.069901, -118.441562);
        Student pamBam = new Student("Pam Bam", 34.071523, -118.441171);
        Classroom principlesOfComputational = new Classroom("Principles of computational geo-location analysis", 34.069140, -118.442689);
        Classroom sedimentaryPetrology = new Classroom("Sedimentary Petrology", 34.069585, -118.441878);
        Classroom introductoryPsychobiology = new Classroom("Introductory Psychobiology", 34.069742, -118.441312);
        Classroom artOfListening = new Classroom("Art of Listening", 34.070223, -118.440193);
        Classroom artHitory = new Classroom("Art Hitory", 34.071528, -118.441211);

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                johnWilson,
                janeGraham,
                pamBam
        ));

        List<Classroom> classroomList = new ArrayList<>(Arrays.asList(
                principlesOfComputational,
                sedimentaryPetrology,
                introductoryPsychobiology,
                artOfListening,
                artHitory
        ));

        List<Student> studentFoundList = Problem2Application.studentFoundList(studentList,classroomList);

        List<Student> actualStudentList = new ArrayList<>(Arrays.asList(
                pamBam
        ));

        Assert.assertEquals(studentFoundList,actualStudentList);

    }

    @Test
    public void testExample3(){

        Student johnWilson = new Student("John Wilson", 35.069849, -119.443539);
        Student janeGraham = new Student("Jane Graham", 35.069901, -119.441562);
        Student pamBam = new Student("Pam Bam", 35.071523, -119.441171);
        Classroom principlesOfComputational = new Classroom("Principles of computational geo-location analysis", 34.069140, -118.442689);
        Classroom sedimentaryPetrology = new Classroom("Sedimentary Petrology", 34.069585, -118.441878);
        Classroom introductoryPsychobiology = new Classroom("Introductory Psychobiology", 34.069742, -118.441312);
        Classroom artOfListening = new Classroom("Art of Listening", 34.070223, -118.440193);
        Classroom artHitory = new Classroom("Art Hitory", 34.071528, -118.441211);

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                johnWilson,
                janeGraham,
                pamBam
        ));

        List<Classroom> classroomList = new ArrayList<>(Arrays.asList(
                principlesOfComputational,
                sedimentaryPetrology,
                introductoryPsychobiology,
                artOfListening,
                artHitory
        ));

        List<Student> studentFoundList = Problem2Application.studentFoundList(studentList,classroomList);

        List<Student> actualStudentList = new ArrayList<>();

        Assert.assertEquals(studentFoundList,actualStudentList);

    }

}
