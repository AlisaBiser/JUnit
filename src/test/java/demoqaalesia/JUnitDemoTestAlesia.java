package demoqaalesia;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class JUnitDemoTestAlesia {

    @BeforeAll
    static void setUp() {
        System.out.println("### @BeforeAll !");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("### @AfterAll !");


    }

    @BeforeEach
    void beforeEachTest() {
        // open("ya.ru");
        System.out.println("###     @BeforeEach !");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("###     @AfterEach !");
    }


    @Test
    void simpleTest() {
        System.out.println("###         @Test simpleTest() !");
        Assertions.assertTrue(3 > 2);

    }


}
