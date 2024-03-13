import java.util.Scanner;

class Leap{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int century = 0 ;
        int year = scan.nextInt();

        if(year%100==0)
        {
            century =1;
        } 
        else
        {
          century = 0;  
        }
        switch(century)
        {
            case 0:
                if(year%4==0)
                {
                    System.out.println(year + " is a Leap Year.");
                }
                else
                {
                     System.out.println(year + " is  Not a Leap Year.");
                }
                break ;
            case 1:
                if(year%400==0)
                 {
                    System.out.println(year + " is a Leap Year.");
                }
                else
                {
                     System.out.println(year + " is  Not a Leap Year.");
                }
                break ;
                default:
                    break;
             }
                   
            scan.close();
        }

    
    


}