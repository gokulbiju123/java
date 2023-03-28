public class product
{
        int pcode;
        String pname;
        double price;
        double lowest;
        void data(int c, String n, double p)
        {
            pcode=c;
            pname=n;
            price=p;
        }
        void display()
        {
            System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
            
        }  
        static void findLowest(double price1,double price2, double price3,double price4,double price5)
        {
        if(price1<=price2 && price1<=price3 && price1<=price4 && price1<=price5)
        {
            System.out.println("\nTelevision has the lowest price!");
            
        }
        else if(price2<=price1 && price2<=price3 && price2<=price4 && price2<=price5)
        {
            System.out.println("\nChair has the lowest price!");
            
        }
         else if(price3<=price1 && price3<=price2 && price3<=price4 && price3<=price5)
        {
            System.out.println("\nTable has the lowest price!");
            
        }
         else if(price4<=price1 && price4<=price2 && price4<=price3 && price4<=price5)
        {
            System.out.println("\nFan has the lowest price!");
            
        }
        else
        {
            System.out.println("\n Oven has the lowest price!");
            
        }
        
       }
      public static void main(String[] args)
      {
          System.out.println("Name:Gokul Biju\nReg No:22MCA028\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate Of submission:24/03/2023\n\n");
            product obj1 = new product();
            product obj2 = new product();
            product obj3 = new product();
            product obj4 = new product();
            product obj5 = new product();
            obj1.data(101,"Tv",57000.00);
            obj2.data(102,"chair",30000.00);
            obj3.data(103,"Table",20000.00);
            obj4.data(104,"Fan",2000.00);
            obj5.data(105,"oven",14000.00);
            System.out.println("Product Information:\nProduct_Code\tProduct_Name\tProduct_Price");
            obj1.display();
            obj2.display();
            obj3.display();
            obj4.display();
            obj5.display();
            findLowest(obj1.price,obj2.price,obj3.price,obj4.price,obj5.price);    
            
        }
    }
