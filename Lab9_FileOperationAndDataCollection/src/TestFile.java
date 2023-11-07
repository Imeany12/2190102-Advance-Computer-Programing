import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TestFile {
    public HashMap<String, ArrayList<Integer>> read_scores(String fileName) {
        // read scores from file
        HashMap<String, ArrayList<Integer>> scores = new HashMap<String, ArrayList<Integer>>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))   {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                if (count == 0) {
                    count++;
                    continue;
                }
                String[] parts = line.split(",");
                if (scores.containsKey(parts[0])){
                    ArrayList<Integer> quizes = scores.get(parts[0]);
                    for (int i = 1; i < parts.length; i++) {
                        int score = Integer.parseInt(parts[i]);
                        quizes.add(score);
                    }
                    scores.put(parts[0], quizes);
                } else {
                    ArrayList<Integer> quizes = new ArrayList<Integer>();
                    for (int i = 1; i < parts.length; i++) {
                        int score = Integer.parseInt(parts[i]);
                        quizes.add(score);
                    }
                    scores.put(parts[0], quizes);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return scores;
    }

    public int getTotalScore(Map<String, ArrayList<Integer>> scores, String studentID) {
        if (scores.containsKey(studentID)) {
            ArrayList<Integer> quizes = scores.get(studentID);
            int totalScore = 0;
            for (int i = 0; i < quizes.size(); i++) {
                totalScore += quizes.get(i);
            }
            return totalScore;
        } else {
            return -1;
        }
    }

    public HashSet<String> getEditedStudentID(String fileName) {
        HashSet<String> editedStudentID = new HashSet<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                if (count == 0) {
                    count++;
                    continue;
                }
                String[] parts = line.split(",");
                editedStudentID.add(parts[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return editedStudentID;
    }

    public void createNewEditedScore(String fileName1, String fileName2, String resultFileName) {
        HashMap<String, ArrayList<Integer>> scores = read_scores(fileName1);
        HashMap<String, ArrayList<Integer>> editedScores = read_scores(fileName2);
        for (String studentID : editedScores.keySet()) {
            scores.get(studentID).set(editedScores.get(studentID).get(0) - 1, editedScores.get(studentID).get(1));
        }

        String filePath = resultFileName;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("ID,Quiz1,Quiz2,Quiz3,Quiz4,Quiz5");
            writer.newLine();
            for (String studentID : scores.keySet()) {
                writer.write(studentID);
                for (int i = 0; i < scores.get(studentID).size(); i++) {
                    writer.write("," + scores.get(studentID).get(i));
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}