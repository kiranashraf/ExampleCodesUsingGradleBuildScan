package highestscore;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTest {

    @Test
    void testJoin() {
        assertEquals("1 2 3", StringJoin.join("1", "2", "3"), "Joined string didn't match");
    }

    @Test
    void testHighestScore() {
        ArrayList<String> score new ArrayList<String>();

        assertEquals("1 2 3", StringJoin.join("1", "2", "3"), "Joined string didn't match");
    }

}
