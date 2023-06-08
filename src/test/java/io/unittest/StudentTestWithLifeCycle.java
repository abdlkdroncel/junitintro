package io.unittest;

import model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

public class StudentTestWithLifeCycle {

    private Student mehmet=new Student("id1","mehmet","test");
    // def lifecylce permethod

    @BeforeAll
    static void setUp(){

    }

    @Test
    void stateCannotChangeWhenLifeCycleIsPerMethod(){
        Assertions.assertEquals("mehmet",mehmet.getName());
        mehmet=new Student("id2","ahmet","test");
    }

    @Test
    void stateChangeWhenLifeCycleIsPerClass(){
        Assertions.assertEquals("mehmet",mehmet.getName());
        mehmet=new Student("id2","ahmet","test");
    }
}
