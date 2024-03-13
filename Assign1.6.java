import java.util.Scanner;

class  BodyMassIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Height :");
        int height = sc.nextInt();
        System.out.println("Enter Your Weight :");
        int weight = sc.nextInt();
        int height1 = height*height;
        int BMI = weight/height1 ;
        System.out.println("BMI is :" + BMI );
        if(BMI < 50)
        {
            System.out.println("Underweight");
        }
        else if (BMI < 100)
        {
            System.out.println("Normal Weight");
        }
        else
        {
            System.out.println("overweight");
        }
    }
    
}
