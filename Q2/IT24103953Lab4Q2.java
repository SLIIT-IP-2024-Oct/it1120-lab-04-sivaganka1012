import java.util.Scanner;
public class IT24103953Lab4Q2 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double exam, lab, exam_p, lab_p, FinalMarks;
        
        System.out.print("Enter the exam marks (0-100):");
        exam = input.nextDouble();
        System.out.print("Enter the lab submission marks (0-100):");
        lab = input.nextDouble();
        System.out.print("Enter the exam percentage (0-100):");
        exam_p = input.nextDouble();
        System.out.print("Enter the lab percentage (0-100):");
        lab_p = input.nextDouble();
        
        FinalMarks = (exam*(exam_p/100))+(lab*(lab_p/100));
        
        if (exam>100||exam<0)
            System.out.println("Invalid input for exam marks. Terminating program.");
        else if (lab>100||lab<0)
            System.out.println("Invalid input for lab submission marks. Terminating program.");
        else if (exam_p>100||exam_p<0)
            System.out.println("Invalid input for exam percentage. Terminating program.");
        else if (lab_p>100||lab_p<0)
            System.out.println("Invalid input for lab submission percentage. Terminating program.");
        else if (lab_p+exam_p>100||lab_p+exam_p<100)
            System.out.println("The percentage must add up to 100. Terminating program.");
        else 
            System.out.println("Final Exam Mark is:"+ FinalMarks);
    }
}