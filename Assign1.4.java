import java.util.Scanner;

class Weekday {
    public static void main(String []arg){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a number from 0 to 7 : ");
        int num = sc.nextInt(); 
       
        System.out.println("Enter Your choice :\n 1.Mon\n2.Tues\n3.Wed\n4.Thur\n5.Fri\n6.Sat\n7.Sun" );
        int choice = sc.nextInt();
 
        switch(choice)
        
        {
            case  1 :              
                System.out.println(" Today is Monday " + choice);
             break ;
            case 2 :                
                System.out.println("Today is Tuesday :" + choice);
             break ;
            case 3 :
             System.out.println(" Today is Wednesday :" + choice);
            break ;
            case 4 :
            System.out.println("Today is Thursday :" +choice);
            break ;
            case 5 :
            System.out.println(" Today is Friday :" + choice);
           break ;
           case 6 :
           System.out.println(" Today is Saturday :" + choice);
           break ;
           case 7 :
           System.out.println(" Today is Sunday :" + choice);
          break ;
             default:
             break;
             
            
        }
    }
}
