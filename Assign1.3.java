import java.util.Scanner;

class Calculator {
    public static void main(String []arg){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number 1 : ");
        int num1 = sc.nextInt(); 
        System.out.println("Enter Your number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Your choice :\n 1.+\n2.-\n3.*\n4./" );
        int choice = sc.nextInt();
    int result = 0 ;
        switch(choice)
        
        {
            case  1 :
                result = num1+num2;
                System.out.println("Sum of two numbers is :" + result);
             break ;
            case 2 :
                 result = num1-num2;
                System.out.println("Substraction of two numbers is :" + result);
             break ;
            case 3 :
             result = num1*num2;
             System.out.println("Product of two numbers is :" + result);
            break ;
            case 4 :
            result = num1/num2;
            System.out.println("Division of two numbers is :" + result);
            break ;

             
             
            
        }
    }
}