import java.util.Scanner;

 class Alphabets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().toLowerCase().charAt(0);
        if(alpha == 'a' || alpha =='e'|| alpha =='i' ||alpha =='o' || alpha =='u' )
       {
        System.out.println(  " is a vowel");
       } 
       else
       {
        System.out.println(  "Is a Consonent");
       }
    }
}
