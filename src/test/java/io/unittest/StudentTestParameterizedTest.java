package io.unittest;

import model.Student;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class StudentTestParameterizedTest {

    private Student student;

    @BeforeEach
    void setStudent(TestInfo testInfo){
        if(testInfo.getTags().contains("create"))
            student=new Student("1","Ahmet","Test");
        else
            student=new Student("1","Mehmet","Test");

    }

    @Test
    @DisplayName("Crate Student")
    @Tag("create")
    void createStudent(TestInfo testInfo){
        Assertions.assertTrue(testInfo.getTags().contains("create"));
        Assertions.assertEquals("Ahmet",student.getName());
    }

    @Test
    @DisplayName("Add Course To Stundent")
    @Tag("addCourse")
    void addCourseToStudent(TestReporter testReporter){
        testReporter.publishEntry("startTime", LocalDate.now().toString());
        Assertions.assertEquals("Mehmet",student.getName());
        testReporter.publishEntry("endTime",LocalDate.now().toString());

    }
}
