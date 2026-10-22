package com.example.demo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2ApplicationTests {

    private final Demo2Application app = new Demo2Application();

    @Test
    void testGradeA() {
        assertEquals("A", app.calculateGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B", app.calculateGrade(80));
    }

    @Test
    void testGradeC() {
        assertEquals("C", app.calculateGrade(60));
    }

    @Test
    void testFail() {
        assertEquals("Fail", app.calculateGrade(30));
    }

    @Test
    void testInvalidMarks() {
        assertEquals("Invalid marks", app.calculateGrade(110));
    }
}