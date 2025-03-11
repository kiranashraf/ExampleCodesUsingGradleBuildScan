package examplecodes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTest {

    @Test
    void testJoin() {
        assertEquals("1 2 3", StringJoin.join("1", "2", "3"), "Joined string didn't match");
    }

    @Test
    void testHighestScore() {
        ArrayList<String> score = new ArrayList<>();
        score.add("adnan");
        score.add("20");

        ArrayList<String> score2 = new ArrayList<>();
        score2.add("farhan");
        score2.add("24");


        ArrayList<String> score3 = new ArrayList<>();
        score3.add("adnan");
        score3.add("30");

        ArrayList<ArrayList<String>> studentScores = new ArrayList<>();
        studentScores.add(score);
        studentScores.add(score2);
        studentScores.add(score3);
        assertEquals(25,  HighestScore.highestScore(studentScores), "Wrong Average Highest Score");
    }

    @Test
    void testSearchInsert() {
        int[] arr = { 1, 2, 3, 5};
        // Convert int[] to ArrayList<Integer> using Streams
        ArrayList<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

        assertEquals(3, SearchInsert.searchInsert(list, 4), "Wrong Insert Position");


    }

}
