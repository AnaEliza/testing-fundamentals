package basics;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJExampleTest {

    @Test
    void testAssertEquals() {
        // Assert (state/claim/affirm) that two values are equal to each other
        int value1 = 13;
        int value2 = 13;
        Assertions.assertThat(value1).isEqualTo(value2);
    }

    @Test
    void testAssertNotNull() {
        // Assert (state/claim/affirm) that a variable is not null
        String value = "SDA Academy";
        Assertions.assertThat(value).isNotNull();
    }

    @Test
    void testAssertNull() {
        // Assert (state/claim/affirm) that a variable is null
        String value = null;
        Assertions.assertThat(value).isNull();
    }

    @Test
    void testAssertTrue() {
        // Assert (state/claim/affirm) that a boolean is true
        boolean value = true;
        Assertions.assertThat(value).isTrue();
    }

    @Test
    void testAssertFalse() {
        // Assert (state/claim/affirm) that a boolean is false
        boolean value = false;
        Assertions.assertThat(value).isFalse();
    }

    @Test
    void testAssertArrayEquals() {
        // Assert (state/claim/affirm) that two arrays are equal
        int[] value = new int[]{1, 2, 3};
        Assertions.assertThat(value).containsExactly(1, 2, 3);
    }

    @Test
    void testAssertAll() {
        // Assert (state/claim/affirm) that 1 + 3 = 4
        int value = 1 + 3;
        Assertions.assertThat(value)
                .isEqualTo(4)
                .isNotEqualTo(5)
                .isLessThan(6)
                .isGreaterThan(3)
                .isBetween(0, 10)
                .isPositive()
                .isEven();
    }

}
