import java.util.Scanner;
public class shapes {
       void area(int r1){
        double Area_val = 3.14*r1*r1;
        System.out.println("\nArea of Circle with Radius "+r1+" = "+Area_val);
    }
    void area(int a1,int b1){
        int Area_val = a1*b1;
        System.out.println("\nArea of Rectangle with dimensions "+a1+" X "+b1+" = "+Area_val);
    }
    void area(int a1,int b1,int c1){
        int Area_val = a1*b1*c1;
        System.out.println("\nArea of Cuboid with dimensions "+a1+" X "+b1+" X "+c1+" = "+Area_val);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:Gokul Biju\nReg No:22MCA028\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate Of submission:06/06/2023\n\n");
        System.out.println("\nEnter the Length");
        int l = sc.nextInt();
        System.out.println("Enter the Breath");
        int b = sc.nextInt();
        System.out.println("Enter the Height");
        int h = sc.nextInt();
        System.out.println("Enter the Radius");
        int r = sc.nextInt();
        shapes obj1 = new shapes();
        obj1.area(r);
        obj1.area(l,b);
        obj1.area(l,b,h);
    }

}
