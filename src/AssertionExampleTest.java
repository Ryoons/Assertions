import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionExampleTest {
    public AssertionExampleTest() {
    }
        @Test
        public void testAssertArrayEquals(){
            byte[] expected = "Toronto".getBytes();
            byte[] actual = "Toronto".getBytes();
            assertArrayEquals(expected, actual, "failure - byte arrayts not same");
        }
        @Test
        public void testAssertEquals(){
        assertEquals("N0123456", "N0654321", "Failure - Username does not exist.");
        // checks that two primitives/objects are equal.
        }

        @Test
        public void testAssertFalse() {
        assertFalse(false, "Failure - should be false");
        // Checks if condition is false
        }
        @Test
        public void testAssertNotNull() {
        assertNotNull(new Object(), "should not be null");
        // checks that an object is not null
        }
        @Test
        public void testAssertNotSame(){
        assertNotSame(new Object(),new Object(), "Should not be the same object");
        // checks that an object is not null
        }
        @Test
        public void testAssertNull(){
        assertNull(null,"should be null");
        // Checks that an object is not null
        }
        @Test
        public void testAssertSame(){
        Integer aNumber = Integer.valueOf(62);
        assertSame(aNumber,aNumber, "Check for same integer value");
        // checks that an object is not null
        }
}
























