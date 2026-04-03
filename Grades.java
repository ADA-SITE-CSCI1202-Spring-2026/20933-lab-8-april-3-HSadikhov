import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grades {

    public static void main(String[] args) {
        
        // a.
        Map<String, Double> gradesMap = new HashMap<>();

        // b. 
        gradesMap.put("Ali", 3.8);
        gradesMap.put("Elmar", 3.2);
        gradesMap.put("Nigar", 4.0);
        gradesMap.put("Elshan", 3.5);
        gradesMap.put("Nargiz", 4.0); 

        // c. 
        double highestGpa = 0.0;
        List<String> topStudents = new ArrayList<>();

        for (Map.Entry<String, Double> entry : gradesMap.entrySet()) {
            double currentGpa = entry.getValue();
            
            if (currentGpa > highestGpa) {
                
                highestGpa = currentGpa;
                topStudents.clear();
                topStudents.add(entry.getKey());
            } else if (currentGpa == highestGpa) {
                
                topStudents.add(entry.getKey());
            }
        }
        System.out.println("Top Student(s): " + topStudents + " with a GPA of " + highestGpa);

        // d. 
        double totalGpa = 0.0;
        for (double gpa : gradesMap.values()) {
            totalGpa += gpa;
        }
        
        
        double averageGpa = gradesMap.isEmpty() ? 0 : totalGpa / gradesMap.size();
        System.out.println("Average GPA: " + averageGpa);

        // e. 
        int belowAverageCount = 0;
        for (double gpa : gradesMap.values()) {
            if (gpa < averageGpa) {
                belowAverageCount++;
            }
        }
        System.out.println("Number of students with a GPA below average: " + belowAverageCount);
    }
}