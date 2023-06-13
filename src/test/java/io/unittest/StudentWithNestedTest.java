package io.unittest;

import model.Course;
import model.LecturerCourseRecord;
import model.Semester;
import model.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class StudentWithNestedTest {

    @Nested
    class CreateStudent{
        @Test
        @DisplayName("Test every student must have an id,name and surname")
        void shouldCreateStudentWithIdNameAndSurname(){
            Student student=new Student("1","kadir","oncel");
            assertEquals("kadir",student.getName());
        }

        @Test
        void addCourseToStudentWithAtTimeConstraint(){
            Student student=new Student("1","kadir","oncel");

            LecturerCourseRecord lecturerCourseRecord=new LecturerCourseRecord(new Course(),new Semester());
            assertTimeout(Duration.ofMillis(1),()->student.addCourse(lecturerCourseRecord));

        }

    }
}
