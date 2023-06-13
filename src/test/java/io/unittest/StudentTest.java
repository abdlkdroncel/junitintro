package io.unittest;

import model.Course;
import model.LecturerCourseRecord;
import model.Semester;
import model.Student;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    @DisplayName("Test every student must have an id,name and surname")
    void shouldCreateStudentWithIdNameAndSurname(){

        Student student=new Student("1","kadir","oncel");

        assertEquals("kadir",student.getName());

        assertNotEquals("kaDir",student.getName());

        assertTrue(student.getName().contains("a"));
        assertTrue(student.getName().contains("k"),()->"Students name must contains k ");

        assertFalse(()->{
            Student s=new Student("2","s","o");
            return !s.getName().contains("s");
        });

        Student student1=new Student("2","student1","oncel");

        assertAll("Studens name check",
                ()->assertTrue(student1.getName().startsWith("st")),
                ()->assertTrue(student1.getSurname().contains("oc")));


    }

    @Test
    void throwsExceptionWhenAddToNullCourseStudent(){

        Student student=new Student("3","student","student");

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> student.addCourse(null));
    }

    @Test
    void addCourseToStudentWithAtTimeConstraint(){
         Student student=new Student("1","kadir","oncel");

        LecturerCourseRecord lecturerCourseRecord=new LecturerCourseRecord(new Course(),new Semester());
        assertTimeout(Duration.ofMillis(1),()->student.addCourse(lecturerCourseRecord));

    }

    @DisabledOnOs({OS.WINDOWS})
    @Test
    void shouldCreateStudentOnlyOnNonMac(){
        Student student=new Student("1","kadir","oncel");

        assertAll(()->assertEquals("kadir",student.getName()));
    }


}
