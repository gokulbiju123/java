import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class treemap{
    public static void main(String[] args) {
     System.out.println("Name:GOKUL BIJU\nReg No:22MCA028\nCourse Code:20MCA132\nCourse Name:OBJECT ORIENTED PROGRAMMING LAB\nDate:04/07/2023\n\n");
        Map<String, Integer> hashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
       
        // Adding elements to the HashMap
        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.println("Enter the elements (key-value pairs):");
        for (int i = 0; i < numElements; i++) {
            String key = scanner.nextLine();
            int value = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            hashMap.put(key, value);
        }

        // Printing the initial HashMap
        System.out.println("Initial HashMap:");
        printMap(hashMap);

        // Converting HashMap to TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        // Printing the final TreeMap
        System.out.println("Final TreeMap:");
        printMap(treeMap);

        scanner.close();
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();
    }
}

