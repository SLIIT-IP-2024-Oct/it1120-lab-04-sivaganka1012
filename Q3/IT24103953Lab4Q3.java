import java.util.Scanner;
public class IT24103953Lab4Q3 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int num 
        
        System.out.print("Enter a number:");
        num=input.nextInt();
        message = (num==0) ? "This number is : Zero" : (num>0) ? "This number is : Negative" : (num<0) ? "This number is : Positive";
        System.out.print(message);