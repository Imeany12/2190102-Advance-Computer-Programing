import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
    
        // Test the methods

        TestFile testFile = new TestFile();

        // Task 1: Test the 'read_scores' method
        HashMap<String, ArrayList<Integer>> allScores = testFile.read_scores("student_scores.csv");
        System.out.println("All Scores:");
        for (String studentID : allScores.keySet()) {
            System.out.println(studentID + " - " + (allScores.get(studentID)));
        }

        // // Task 2: Test the 'getTotalScore' method
        String studentIDToLookup = "6632462421";
        int totalScore = testFile.getTotalScore(allScores, studentIDToLookup);
        if (totalScore != -1) {
            System.out.println("Total Score for " + studentIDToLookup + ": " + totalScore);
        } else {
            System.out.println("Student not found.");
        }

        // // Task 3: Test the 'getEditedStudentID' method
        HashSet<String> editedStudentIDs = testFile.getEditedStudentID("edited_scores.csv");
        System.out.println("Edited Student IDs: " + editedStudentIDs);

        // Task 4: Test the 'createNewEditedScore' method
        testFile.createNewEditedScore("student_scores.csv", "edited_scores.csv", "new_scores.csv");
        System.out.println("New scores have been written to 'new_scores.csv'.");
        }    
}
