import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class demonstratecreation {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        Scanner scanner = new Scanner(System.in);
       System.out.println("Name:GOKUL BIJU\nReg No:22MCA028\nCourse Code:20MCA132\nCourse Name:OBJECT ORIENTED PROGRAMMING LAB\nDate:27/06/2023\n\n");

        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            set.add(element);
        }

        System.out.println("Elements in the set:");
        for (int element : set) {
            System.out.println(element);
        }

        scanner.close();
    }
}

