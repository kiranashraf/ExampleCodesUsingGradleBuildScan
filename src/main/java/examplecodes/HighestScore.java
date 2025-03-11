package highestscore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HighestScore {
    public int highestScore(ArrayList<ArrayList<String>> A) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        for (ArrayList<String> StudentsMarks : A) {
            String student = StudentsMarks.get(0);
            Integer marks = Integer.valueOf(StudentsMarks.get(1));
            if(map.containsKey(student)){
                List<Integer> studentMarks = map.get(student);
                studentMarks.add(marks);
            } else{
                List<Integer> studentMarks = new ArrayList<>();
                studentMarks.add(marks);
                map.put(student, studentMarks);
            }
        }

        int max = 0;

        for (List<Integer> studentMarks : map.values()) {
            int sum = 0;
            for(Integer marks: studentMarks){
                sum += marks;
            }
            sum = sum/studentMarks.size();
            if(sum > max){
                max = sum;
            }
        }

        return max;

    }
}
