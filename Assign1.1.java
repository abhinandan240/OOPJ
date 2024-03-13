import java.util.Scanner;

class Score{
    public static void main(String []arg){
        int score;
        char grade;
        Scanner marks = new Scanner(System.in);

        System.out.println("Enter Your Score : ");
        score = marks.nextInt();

        if(score>=90)
        {
            grade = 'A';
        
        }
        else if (score>=70)
        {
            grade = 'B';
        }
        else if (score>=40)
        {
            grade = 'C';
        }
        else 
        {
            grade = 'F';
        
        }
        System.out.println("Your grade is : " + grade);


    }

}