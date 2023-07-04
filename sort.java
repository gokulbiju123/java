import java.util.Arrays;
import java.util.Scanner;

public class sort {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Name:Gokul Biju\nReg No:22MCA028\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate Of submission:28/03/2023\n\n");
      System.out.print("Enter the number of strings you want to sort: ");
      int n = input.nextInt();
      String[] names = new String[n];
      
      System.out.println("Enter the strings to be sorted:");
      for (int i = 0; i < n; i++) {
         names[i] = input.next();
      }
      
      Arrays.sort(names);

      System.out.println("Sorted Names: ");
      for (String name : names) {
         System.out.println(name);
      }
   }
}

