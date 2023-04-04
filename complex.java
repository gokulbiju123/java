import java.util.Scanner;

class Complex 
{
    int real;
    int img;
}
public class complex
{
    public static void main(String[] args) 
    {
        System.out.println("Name:GOKUL BIJU\nReg No:22MCA028\nCourse Code:20MCA132\nCourse Name:OBJECT ORIENTED PROGRAMMING LAB\nDate:28/03/2023\n\n");
        Scanner SC = new Scanner(System.in);
        Complex num1 = new Complex();
            Complex num2 = new Complex();
        Complex num3 = new Complex();
        System.out.printf("Enter a first complex number (real and imaginary): ");
        num1.real = SC.nextInt();
        num1.img = SC.nextInt();
        System.out.printf("Enter a second complex number (real and imaginary): ");
            num2.real = SC.nextInt();
            num2.img = SC.nextInt();
        num3.real = num1.real + num2.real;
            num3.img = num1.img + num2.img;
        if(num3.img >= 0)
        {
            System.out.printf("Result is = %d + %di\n", num3.real, num3.img);
        }
            else
            {
                  System.out.printf("Result is = %d %di\n", num3.real, num3.img);
          }
    
    }    
}
