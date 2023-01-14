package me.doky.thejavathest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @Test
    @DisplayName("create")
    void create() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @Test
    @Disabled
    @DisplayName("create1")
    void create1() {
        System.out.println("create1");
    }

    @BeforeAll
    @DisplayName("Before All")
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    @DisplayName("After All")
    static void afterAll() {
        System.out.println("after All");
    }

    @BeforeEach
    @DisplayName("Before Each")
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    @DisplayName("After Each")
    void afterEach() {
        System.out.println("after Each");
    }

}