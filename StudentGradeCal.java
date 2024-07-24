import java.util.Scanner;

public class StudentGradeCal{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the total Number of Subject: ");
        int totalSubject = a.nextInt();
        double sum = 0;
        double avg;
        double[] marks = new double[totalSubject];
        System.out.println("Enter the mark of the subject: ");
        for (int i = 0; i < totalSubject; i++) {
            double m = a.nextDouble();
            if(m <= 100){
                marks[i] = m;
            }else {
                System.out.println("oops! marks should be less then and equal to 100 or should not be Negative");
                marks[i] = a.nextDouble();
            }
            sum += marks[i];

        }

        avg = sum / totalSubject;

        System.out.println("Total marks is = " + sum +
                            "\nTotal average percentage is = " + avg + "%");

        if(avg>= 91 && avg <= 100){
            System.out.println("Grade 'A1'");
        } else if(avg >= 81 && avg <= 90){
            System.out.println("Grade 'A2'");
        }else if(avg >= 71 && avg <= 80){
            System.out.println("Grade 'B1'");
        }else if(avg >= 61 && avg <= 70){
            System.out.println("Grade 'B2'");
        }else if(avg >= 51 && avg <= 60){
            System.out.println("Grade 'C1'");
        }else if(avg >= 41 && avg <= 50){
            System.out.println("Grade 'C2'");
        }else if(avg >= 33 && avg <= 40){
            System.out.println("Grade 'D'");
        }else{
            System.out.println("Grade 'F' ");
        }


    }
}