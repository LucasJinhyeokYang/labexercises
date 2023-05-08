
/**
 * Write a description of class LabExercise2BasicMaths here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LabExercise2BasicMaths{
    public static void main (String[ ] args) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        int num1;
        int num2;
        int answer1;
        int answer2;
        int answer3;
        
        System.out.printf ("Please enter a number");
        num1 = keyboard.nextInt( );
        System.out.printf ("Please enter another number");
        num2 = keyboard.nextInt( );
        
    
        answer1 = num1 + num2;
        answer2 = num1 - num2;
        answer3 = num1 * num2;
        
        
        
        
        System.out.printf (num1 + " + " + num2 + " = " + answer1 + " \n");
        System.out.printf (num1 + " - " + num2 + " = " + answer2 + " \n");
        System.out.printf (num1 + " x " + num2 + " = " + answer3 + " \n");
    }//end of main method
        
        
    }//end of LabExercise2Basicmaths class

