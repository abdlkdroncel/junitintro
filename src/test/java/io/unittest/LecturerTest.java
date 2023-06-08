package io.unittest;

import model.Course;
import model.Lecturer;
import model.LecturerCourseRecord;
import model.Semester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LecturerTest {

    private Lecturer lecturer;

    @BeforeEach
    void setUp() {
        lecturer = new Lecturer();
    }

    @Test
    void whenACourseIsAddedToLecturerThenLecturerCourseSizeIncrease() {


        assertEquals(0, lecturer.getLecturerCourseRecords().size());
        lecturer.addLecturerCourseRecord(lecturerCourseRecord());

        assertEquals(1, lecturer.getLecturerCourseRecords().size());
    }

    private LecturerCourseRecord lecturerCourseRecord() {
        return new LecturerCourseRecord(new Course(), new Semester());
    }

    @Test
    void lecturerCourseRecordHasLecturerInfoWhenAddedToALecturer() {
        LecturerCourseRecord lecturerCourseRecord=lecturerCourseRecord();
        lecturer.addLecturerCourseRecord(lecturerCourseRecord);
        assertEquals(lecturer,lecturerCourseRecord.getLecturer());
    }


}
