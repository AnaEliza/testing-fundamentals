package basics;

import org.junit.jupiter.api.*;

public class JUnitExampleTest {

    @BeforeAll
    static void beforeAll() {
        // Used to warm up expensive test resource like database connections
        System.out.println("beforeAll - Executed once before any test starts");
        System.out.println();
    }

    @BeforeEach
    void beforeEach() {
        // Used to prepared objects that will be used across tests
        System.out.println("beforeEach - Executed before each test");
    }

    @AfterEach
    void afterEach() {
        // Used to restore common objects to their original state
        System.out.println("afterEach - Executed after each test");
        System.out.println();
    }

    @AfterAll
    static void afterAll() {
        // Used to release the expensive resources created inside beforeEach
        System.out.println("afterAll - Executed once after all tests are finished");
    }

    @Test
    @DisplayName("My First Test")
    void myFirstTest() {
        System.out.println("My first test");
    }

    @Test
    @Disabled // It is not a good practice to keep tests disabled
    void mySecondTest() {
        System.out.println("My second test");
    }

    @Test
    void testAssertEquals() {
        // Assert (state/claim/affirm) that two values are equal to each other
        int value1 = 13;
        int value2 = 13;
        Assertions.assertEquals(value1, value2);
    }

    @Test
    void testAssertNotNull() {
        // Assert (state/claim/affirm) that a variable is not null
        String value = "SDA Academy";
        Assertions.assertNotNull(value);
    }

    @Test
    void testAssertNull() {
        // Assert (state/claim/affirm) that a variable is null
        String value = null;
        Assertions.assertNull(value);
    }

    @Test
    void testAssertTrue() {
        // Assert (state/claim/affirm) that a boolean is true
        boolean value = true;
        Assertions.assertTrue(value);
    }

    @Test
    void testAssertFalse() {
        // Assert (state/claim/affirm) that a boolean is false
        boolean value = false;
        Assertions.assertFalse(value);
    }

    @Test
    void testAssertArrayEquals() {
        // Assert (state/claim/affirm) that an
        int[] value = new int[]{1, 2, 3};
        Assertions.assertArrayEquals(value, new int[]{1, 2, 3});
    }

    @Test
    void testAssertAll() {
        // Assert (state/claim/affirm) that 1 + 3 = 4
        int value = 1 + 3;
        Assertions.assertAll(
                () -> Assertions.assertEquals(4, value),
                () -> Assertions.assertNotEquals(5, value),
                () -> Assertions.assertTrue(value < 6)
        );
    }

}
